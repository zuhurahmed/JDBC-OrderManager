package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {
    private Connection connection;

    public ProductDAO(Connection connection) {
        this.connection = connection;
    }

    public void getProductFromDB(int order_id, int amount, String product_name, BigDecimal price) throws SQLException {
        PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO order_products(order_id,product_name,amount, price_per_unit) VALUES (?,?,?,?) ");

        preparedStatement.setInt(1,order_id);
        preparedStatement.setInt(2,amount);
        preparedStatement.setBigDecimal(3,price);
        preparedStatement.setString(2,product_name);

        preparedStatement.execute();
    }
}
