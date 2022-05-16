package dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Pasan Pahasara
 * @since : 0.1.0
 **/
public interface CrudDAO<T, ID> extends SuperDAO{
    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;

    boolean save(T dto) throws SQLException, ClassNotFoundException;

    boolean update(T dto) throws SQLException, ClassNotFoundException;

    T search(ID id)throws SQLException,ClassNotFoundException;

    boolean exist(ID id) throws SQLException, ClassNotFoundException;

    boolean delete(ID id) throws SQLException, ClassNotFoundException;

    String generateNewID() throws SQLException, ClassNotFoundException;
}
