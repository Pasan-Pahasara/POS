package dao.custom;

import java.sql.SQLException;

/**
 * @author : Pasan Pahasara
 * @since : 0.1.0
 **/

public interface QueryDAO {
    void searchOrderByOrderID(String id)throws SQLException,ClassNotFoundException;
}
