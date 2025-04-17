package org.kosmonova;

import org.kosmonova.config.HikariConnection;
import org.kosmonova.model.Agency;
import org.kosmonova.repository.AgencyDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        // System.out.println(System.getenv("DB_URL"));

        // set up hikari connection
        Connection connection = new HikariConnection().getConnection();

        // set up agency DAO
        AgencyDAO agencyDAO = new AgencyDAO(connection);

        // test agency
        Agency testAgency = new Agency("German Aerospace Center" , "Germany" , "Europe", "DLR");
        agencyDAO.create(testAgency);

        List<Agency> testList = agencyDAO.getAll();
        testList.forEach((agency -> System.out.println(agency.getName())));

        Agency updateAgency = agencyDAO.get(2);
        updateAgency.setContinent("Asia");
        agencyDAO.update(updateAgency);
        agencyDAO.delete(updateAgency);
    }
}