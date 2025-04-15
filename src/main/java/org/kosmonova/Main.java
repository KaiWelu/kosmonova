package org.kosmonova;

import data.HikariConnection;
import models.Employee;

public class Main {
    public static void main(String[] args) {

        System.out.println(System.getenv("DB_URL"));

        HikariConnection connection = new HikariConnection();
    }
}