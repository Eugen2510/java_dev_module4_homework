package storage;

import java.sql.*;

public class Database {
    private final static  String DATA_BASE_PATH = "jdbc:h2:./src/main/java/database/my_db";
    private final static Database INSTANCE = new Database();
    private Connection connection;
    private Database(){
        try{
            connection = DriverManager.getConnection(DATA_BASE_PATH);

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static Database getInstance(){
        return INSTANCE;
    }

    public Connection getConnection(){
        return connection;
    }

    public void executeUpdate(String sql){
        try(Statement statement = connection.createStatement()){
            statement.executeUpdate(sql);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String sql){
        try{
            Statement statement = connection.createStatement();
            return statement.executeQuery(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }





}
