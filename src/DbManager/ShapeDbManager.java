package DbManager;

import model.Ishape;

import java.sql.*;

public class ShapeDbManager {

    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/proftaakdb?serverTimezone=UTC";
    private String user = "root";
    private String password = "root";

    public ShapeDbManager() {

    }

    public Connection getConnection(){
        if(con != null){
            return con;
        }
        System.out.println("Could not return a connection");
        return null;
    }

    public void connectToDatabase(){
        try{
            this.con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.out.println("Could not connect to database");
            e.printStackTrace();
        }
    }

    public void closeConnection(){
        try{
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable(){
        try{
            DatabaseMetaData dbm = con.getMetaData();
            ResultSet rs = dbm.getTables(null, null, "proftaakdb", null);
            if(rs.next()){
                System.out.println("Table exists");
            }else{
                System.out.println("Table does not exist");
                Statement statement = con.createStatement();
                String sql = "CREATE TABLE PROFTAAKDB"+
                        "(id INT NOT NULL AUTO_INCREMENT, "+
                        "straal DOUBLE,"+
                        "breedte DOUBLE ,"+
                        "hoogte DOUBLE ,"+
                        "lengte DOUBLE ,"+
                        "vorm VARCHAR(10),"+
                        "inhoud DOUBLE ,"+
                        "PRIMARY KEY(id))";
                statement.executeUpdate(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public ResultSet select(PreparedStatement statement){
        ResultSet rs = null;
        try{
            rs = statement.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            return rs;
        }
    }

    public boolean insert(PreparedStatement statement){
        try{
            int inserted = statement.executeUpdate();
            if(inserted>0){
                System.out.println("Inserted Succesfully");
                return true;
            }else{
                System.out.println("Could not insert item");
                return false;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(PreparedStatement statement){
        try{
            int deleted = statement.executeUpdate();
            if(deleted>0){
                System.out.println("Remove Succesfully");
                return true;
            }else{
                System.out.println("Could not remove item");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }




}



//package DbManager;
//
////STEP 1. Import required packages
//        import java.sql.*;
//
//
//
//public class ShapeDbManager {
//
//    // JDBC driver name and database URL
//    //static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    static final String DB_URL = "jdbc:mysql://localhost:3307/world?serverTimezone=UTC";
//
//    //  Database credentials
//    static final String USER = "username";
//    static final String PASS = "password";
//
//    Connection conn = null;
//    Statement stmt = null;
//
//    public ShapeDbManager() {
//
//        maakDatabase();
//    }
//
//    public boolean maakDatabase() {
//
//        try{
//            //STEP 2: Register JDBC driver
//            Class.forName("com.mysql.jdbc.Driver");
//
//            //STEP 3: Open a connection
//            System.out.println("Connecting to database...");
//            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//
//            //STEP 4: Execute a query
//            System.out.println("Creating database...");
//            stmt = conn.createStatement();
//
//            String sql = "CREATE DATABASE PROFTAAK";
//            stmt.executeUpdate(sql);
//            System.out.println("Database created successfully...");
//        }catch(SQLException se){
//            //Handle errors for JDBC
//            se.printStackTrace();
//        }catch(Exception e){
//            //Handle errors for Class.forName
//            e.printStackTrace();
//        }finally{
//            //finally block used to close resources
//            try{
//                if(stmt!=null)
//                    stmt.close();
//            }catch(SQLException se2){
//            }// nothing we can do
//            try{
//                if(conn!=null)
//                    conn.close();
//            }catch(SQLException se){
//                se.printStackTrace();
//            }//end finally try
//        }//end try
//        System.out.println("Goodbye!");
//
//        return true;
//    }
//}
//https://www.youtube.com/watch?v=3KT0haOSTEg
