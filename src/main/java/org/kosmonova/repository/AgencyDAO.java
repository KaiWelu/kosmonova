package org.kosmonova.repository;
import org.kosmonova.model.Agency;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class AgencyDAO implements Dao<Agency> {

   private final Connection connection;

    public AgencyDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Agency get(int id) throws SQLException {
        Agency output = null;

        String query = "SELECT * FROM agencies WHERE agency_id = ?;";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();

        if(resultSet.next()) {
            output = new Agency(resultSet.getInt("agency_id"),
                                resultSet.getString("name"),
                                resultSet.getString("country"),
                                resultSet.getString("continent"),
                                resultSet.getString("acronym"));
        }
        return output;
    }

    @Override
    public List<Agency> getAll() throws SQLException {
        ArrayList<Agency> output = new ArrayList<>();

        String query = "SELECT * FROM agencies;";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        while(resultSet.next()) {
            output.add(new Agency(resultSet.getInt("agency_id"),
                                  resultSet.getString("name"),
                                  resultSet.getString("country"),
                                  resultSet.getString("continent"),
                                  resultSet.getString("acronym")));
        }

        return output;

    }

    @Override
    public void create(Agency agency) throws SQLException {
        String query = "INSERT INTO agencies (name, country, continent, acronym) " +
                       "VALUES (?, ?, ?, ?) " +
                       "ON CONFLICT (name) DO NOTHING";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, agency.getName());
        statement.setString(2, agency.getCountry());
        statement.setString(3, agency.getContinent());
        statement.setString(4, agency.getAcronym().toUpperCase());

        int rows = statement.executeUpdate();
        System.out.println(rows + " rows affected");
    }

    @Override
    public void update(Agency agency) throws SQLException {
        String query = "UPDATE agencies " +
                       "SET name = ?, country = ?, continent = ?, acronym = ? " +
                       "WHERE agency_id = ?;";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, agency.getName());
        statement.setString(2, agency.getCountry());
        statement.setString(3, agency.getContinent());
        statement.setString(4, agency.getAcronym().toUpperCase());
        statement.setInt(5, agency.getId());

        int rows = statement.executeUpdate();
        System.out.println(rows + " rows affected by update!");
    }

    @Override
    public void delete(Agency agency) throws SQLException {
        String query = "DELETE FROM agencies WHERE agency_id = ?;";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, agency.getId());

        int rows = statement.executeUpdate();
        System.out.println(rows + " rows deleted!");
    }
}
