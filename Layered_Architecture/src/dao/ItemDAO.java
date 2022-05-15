package dao;

import model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Pasan Pahasara
 * @since : 0.1.0
 **/
public interface ItemDAO extends CrudDAO<ItemDTO,String> {
    public ArrayList<ItemDTO> getItemFromPrice(double price)throws ClassNotFoundException, SQLException;
}
