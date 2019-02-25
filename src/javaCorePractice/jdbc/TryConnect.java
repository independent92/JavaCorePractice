package javaCorePractice.jdbc;
import java.sql.*;


//STEP 1. Import required packages
import java.sql.*;

public class TryConnect {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/test_db";

    //  Database credentials
    static final String USER = "test_user";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println(String.format("Max connections: %s", conn.getMetaData().getMaxConnections()));

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql;
            sql = "SELECT id FROM Country";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            int i = 0;
            while(rs.next()){
                //Retrieve by column name
                String id  = rs.getString("id");
                //Display values
                System.out.println(String.format("country ID: %s (%d)", id, i));
                i++;
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end TryConnect
