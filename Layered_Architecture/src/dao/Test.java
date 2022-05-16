package dao;

/**
 * @author : Pasan Pahasara
 * @since : 0.1.0
 **/
public class Test {
    public static void main(String[] args) {
//        DAOFactory daoFactory = new DAOFactory();
//        DAOFactory daoFactor2 = new DAOFactory();

//        System.out.println(daoFactory);
//        System.out.println(daoFactor2);

        DAOFactory daoFactory1 = DAOFactory.getDaoFactory();
        DAOFactory daoFactory2 = DAOFactory.getDaoFactory();
        System.out.println(daoFactory1);
        System.out.println(daoFactory2);


    }
}
