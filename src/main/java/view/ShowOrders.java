package view;

import Service.OrderService;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import dao.ConnectionManager;
import dao.OrderDao;
import model.OrderProduct;
import model.Orders;

import java.sql.SQLException;
import java.util.List;


public class ShowOrders {
    private OrderDao orderDao = new OrderDao(ConnectionManager.getInstance().getConnection());
    private OrderService orderService = new OrderService(orderDao);

    public void showOrder(int id) throws SQLException {
      Orders orders=orderService.getOrder(id);
    }

    public void showOrdersAndProducts(int id) throws SQLException {
        List<OrderProduct> orderAndProducts = (List<OrderProduct>) orderService.getOrder(id);
        orderAndProducts.forEach(System.out::println);
    }

    public void sendOrder(int id) throws SQLException {
        System.out.println("order:");
        showOrder(id);
        orderService.sendOrder(id);
        System.out.println("");
        System.out.println("Updated order:");
        showOrder(id);
    }

    public void createNewOrder() throws SQLException {
        orderService.makeOrder();
    }
}
