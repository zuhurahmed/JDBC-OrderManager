package App;

import dao.ConnectionManager;
import dao.OrderDao;
import model.Orders;
import view.Product;
import view.ShowOrders;

import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try {
            ConnectionManager.getInstance( ).init( );
            Product product=new Product();
            
            ShowOrders showOrders=new ShowOrders();

            showOrders.createNewOrder();
        } catch (Exception exception) {
         exception.printStackTrace();
        }

    }
}
