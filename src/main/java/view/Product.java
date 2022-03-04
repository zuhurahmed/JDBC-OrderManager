package view;

import Service.ProductService;
import dao.ConnectionManager;
import dao.ProductDAO;

public class Product {
    private ProductDAO dao=new ProductDAO(ConnectionManager.getInstance( ).getConnection( ));
    private ProductService service= new ProductService(dao);

}
