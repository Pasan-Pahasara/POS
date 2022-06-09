package dao.custom;

import dao.CrudDAO;
import dto.CustomerDTO;
import entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Pasan Pahasara
 * @since : 0.1.0
 **/
public interface CustomerDAO extends CrudDAO<Customer,String> {
    public ArrayList<Customer> getAllCustomersByAddress(String address)throws ClassNotFoundException, SQLException;
}
