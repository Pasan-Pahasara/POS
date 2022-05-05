package dao;

import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface CrudDAO {
    ArrayList<Object> getAll() throws SQLException, ClassNotFoundException;

    boolean save(Object dto) throws SQLException, ClassNotFoundException;

    boolean update(Object dto) throws SQLException, ClassNotFoundException;

    boolean exist(Object id) throws SQLException, ClassNotFoundException;

    boolean delete(Object id) throws SQLException, ClassNotFoundException;

    String generateNewID() throws SQLException, ClassNotFoundException;
}
