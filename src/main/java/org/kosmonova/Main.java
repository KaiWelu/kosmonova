package org.kosmonova;

import org.kosmonova.repository.HikariConnection;

public class Main {
    public static void main(String[] args) {

        System.out.println(System.getenv("DB_URL"));

        HikariConnection connection = new HikariConnection();
    }
}