package dao;

import model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class ItemDAOImpl implements ItemDAO {

    @Override
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.executeQuery("SELECT * FROM Item");
        ArrayList<ItemDTO> allItems = new ArrayList<>();
        while (rst.next()) {
            allItems.add(new ItemDTO(rst.getString(1), rst.getString(2), rst.getBigDecimal(3), rst.getInt(4)));
        }
        return allItems;
    }

    @Override
    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeUpdate("DELETE FROM Item WHERE code=?", code);
    }

    @Override
    public boolean addItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeUpdate("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)", dto.getCode(), dto.getDescription(), dto.getUnitPrice(), dto.getQtyOnHand());
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeUpdate("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?", dto.getDescription(), dto.getUnitPrice(), dto.getQtyOnHand(), dto.getCode());
    }

    @Override
    public boolean existItem(String code) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeQuery("SELECT code FROM Item WHERE code=?", code).next();
    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.executeQuery("SELECT code FROM Item ORDER BY code DESC LIMIT 1;");
        if (rst.next()) {
            String id = rst.getString("code");
            int newItemId = Integer.parseInt(id.replace("I00-", "")) + 1;
            return String.format("I00-%03d", newItemId);
        } else {
            return "I00-001";
        }
    }
}
