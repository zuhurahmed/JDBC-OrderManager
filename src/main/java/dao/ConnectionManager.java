package dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
        private static ConnectionManager instance = new ConnectionManager( );

        public static ConnectionManager getInstance() {
            return instance;
        }

        private Connection connection;
        public ConnectionManager() {
        }

        public void init() throws SQLException, IOException {
            connection = DriverManager.getConnection("jdbc:mysql://moktok.intecbrussel.org:33061/zuhur" , "zuhur", "zuhur2021");
        }

        public Connection getConnection() {
            return this.connection;
        }

        public void close() throws SQLException {
            connection.close( );
        }
    }