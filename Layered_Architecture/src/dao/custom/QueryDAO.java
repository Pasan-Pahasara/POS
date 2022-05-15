package dao.custom;

import model.CustomDTO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Pasan Pahasara
 * @since : 0.1.0
 **/

public interface QueryDAO {
    ArrayList<CustomDTO> searchOrderByOrderID(String id)throws SQLException,ClassNotFoundException;
}
