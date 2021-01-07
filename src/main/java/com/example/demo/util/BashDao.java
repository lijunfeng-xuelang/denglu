package com.example.demo.util;

import java.sql.*;

public class BashDao {//BashDao是放执行sql的语句
    private Connection connection;
    private PreparedStatement preparedStatement;

    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","ljf","Wm$5788248$");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public Connection getConnection(){
        if (connection == null)
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                    "ljf","Wm$5788248$");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
    public ResultSet executeQuery(String sql,Object ... params){
        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++)
                preparedStatement.setObject(i+1,params[i]);
            return preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    public int executeUpdate(String sql, Object ... params){//更新
        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++)
                preparedStatement.setObject(i+1,params[i]);
            return preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  -1;
    }
}
