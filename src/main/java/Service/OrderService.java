package Service;

import dao.OrderDao;
import model.OrderProduct;
import model.Orders;

import java.sql.SQLException;
import java.util.List;

public class OrderService {
    private OrderDao dao;

    public OrderService(OrderDao dao) {
        this.dao = dao;
    }
    public void makeOrder(){
    }
    public void getProduct(Orders id) throws SQLException {
        dao.getAllOrders(id);
    }

    public Orders getOrder(int id) throws SQLException {
        return getOrder(id);
    }

    public List<OrderProduct> getOrdersNotSent() throws SQLException {
        return getOrdersNotSent();
    }

    public void sendOrder(int id) throws SQLException {
       sendOrder(id);
    }
}
