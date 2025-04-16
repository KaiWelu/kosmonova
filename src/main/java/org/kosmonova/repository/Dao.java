package org.kosmonova.repository;

import java.sql.SQLException;
import java.util.List;

// this interface defines the structure of the Daos used in this project

public interface Dao<T> {

    T get(int id) throws SQLException;

    List<T> getAll();

    void create(T t) throws SQLException;

    void update(T t);

    void delete(T t);

}
