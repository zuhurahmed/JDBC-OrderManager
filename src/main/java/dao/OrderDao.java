package dao;

import model.Orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDao {
    private Connection connection;


    public OrderDao(Connection connection) {
        this.connection = connection;
    }

    public void getAllOrders(Orders orders) throws SQLException {
        PreparedStatement statement = connection.prepareStatement
                ("INSERT INTO order_table (order_number,is_send,order_delivery_city,order_date) VALUES (?,?,?,?)");
        statement.setString(1, orders.getOrderNumber( ));
        statement.setBoolean(2, orders.isSend( ));
        statement.setString(3, orders.getOrderDeliveryCity( ));
        statement.setString(4, orders.getOrderClient( ));
        statement.setInt(2, orders.getId( ));
        statement.setInt(4, orders.getIsVatFree( ));

        statement.execute( );
    }

    public Orders getOrder(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from order_table where id=?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery( );
        if (resultSet.next( )) {
            return new Orders(resultSet.getInt("id"), resultSet.getString("order_number"),
                    resultSet.getString("order_client"),
                    resultSet.getString("order_delivery_address"),
                    resultSet.getInt("order_delivery_postalcode"), resultSet.getString("order_delivery_city"),
                    resultSet.getInt("is_vat_free"), resultSet.getBoolean("is_send"), resultSet.getString("order_date"));
        } else {
            System.out.println("No record"+id);
        }
        return null;
    }

    public void updateOrder(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("UPDATE order_table SET is_send = 1 WHERE id = ?");
        statement.executeUpdate();

    }
}