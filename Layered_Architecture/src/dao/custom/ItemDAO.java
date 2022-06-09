package dao.custom;

import dao.CrudDAO;
import dto.ItemDTO;
import entity.Item;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Pasan Pahasara
 * @since : 0.1.0
 **/
public interface ItemDAO extends CrudDAO<Item,String> {
    public ArrayList<Item> getItemFromPrice(double price)throws ClassNotFoundException, SQLException;
}
