package lk.ijse.pos.dao.custom;

import lk.ijse.pos.dao.SuperDAO;
import lk.ijse.pos.dto.CustomDTO;
import lk.ijse.pos.entity.CustomEntity;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Pasan Pahasara
 * @since : 0.1.0
 **/

public interface QueryDAO extends SuperDAO {
    ArrayList<CustomEntity> searchOrderByOrderID(String id)throws SQLException,ClassNotFoundException;
}
