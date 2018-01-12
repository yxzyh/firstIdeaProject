package com.fis.test.mysql;



import java.sql.*;


public class ConnectDB {
    private String url="jdbc:mysql://192.168.187.1:3306/sqoop";
    private String uName="root";
    private String passWord="123456";

    private boolean connect()  {
        boolean flage = false;
        Connection con = null;

        //1.加载驱动，将Driver注册到DriverManager类中。
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Can not find Driver!");
            e.printStackTrace();
        }

        //2.jdbc url

        String jdbcUrl = "jdbc:mysql://192.168.187.1:3306/sqoop?";

        //3.创建数据库连接。

        try {
            con = DriverManager.getConnection(url,uName,passWord);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //4.创建一个statement
        Statement stmt = null;
        try {
             stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //5.执行sql
        String sql = "select * from dog";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                String id = rs.getString("ID");
                String name = rs.getString("DogName");
                System.out.println("Connect Successfully!");
                System.out.println("id = " + id);
                System.out.println("name = " + name);
                flage = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return flage;
    }

    public static void main(String[] args) {
        ConnectDB con = new ConnectDB();
        boolean f = con.connect();
        System.out.println(f);
    }
}
