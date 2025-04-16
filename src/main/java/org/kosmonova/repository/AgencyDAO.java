package org.kosmonova.repository;

import org.kosmonova.config.HikariConnection;
import org.kosmonova.model.Agency;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        String query = "SELECT * FROM agencies WHERE id = ?;";
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
    public List<Agency> getAll() {
        return null;
        //return List.of();
    }

    @Override
    public void create(Agency agency) throws SQLException {
        String query = "INSERT INTO agencies (name, country, continent, acronym) " +
                       "VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, agency.getName());
        statement.setString(2, agency.getCountry());
        statement.setString(3, agency.getContinent());
        statement.setString(4, agency.getAcronym().toUpperCase());

        int rows = statement.executeUpdate();
        System.out.println(rows + " rows affected");
    }

    @Override
    public void update(Agency agency) {

    }

    @Override
    public void delete(Agency agency) {

    }
}
