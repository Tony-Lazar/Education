package databases.luv2code.tutorial;

import java.sql.*;

public class Driver {
    public static final String URL      = "jdbc:mysql://localhost:3306/music";
    public static final String LOGIN    = "root";
    public static final String PASSWORD = "Equilibrium20!4";

    public static void main(String[] args) {


        try {
            // 1. get a connection to database
            Connection myCon = DriverManager.getConnection(URL, LOGIN, PASSWORD);

            // 2. create a statement
//            Statement myStmt = myCon.createStatement();
            PreparedStatement myStmt = myCon.prepareStatement("select * from employees where last_name like ?");
            myStmt.setString(1, "p%");
            // 3. execute SQL query
            ResultSet myRs;

            myRs = select(myStmt);
            while (myRs.next()) {
                System.out.println(myRs.getString("name") + ", " + myRs.getString("history"));
            }

            String sqlInsert = "insert into employees " +
                    " (last_name, first_name, email)" +
                    " values ('Brown', 'David', 'david.brown@gmail.com')";
//            insert(myStmt, sqlInsert);

            String sqlUpdate = "update employees " +
                    " set email = 'demo@demo.demo'" +
                    " where id = 5";
//            update(myStmt, sqlUpdate);

            String sqlDelete = "delete from employees " +
                    " where last_name = 'Brown'";
//            delete(myStmt, sqlDelete);

//            myRs = myStmt.executeQuery();
            /*while(myRs.next())
                System.out.println(myRs.getString("first_name") + ", " + myRs.getString("last_name"));
*/
            // 4. process the result set
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static ResultSet select(Statement myStmt) throws SQLException {
        return myStmt.executeQuery("select * from music.genres");
    }

    private static void insert(Statement myStmt, String sql) throws SQLException {
        myStmt.executeUpdate(sql);
        System.out.println("insert complete.");
    }

    private static void update(Statement myStmt, String sql) throws SQLException {
        myStmt.executeUpdate(sql);
        System.out.println("update complete");
    }

    private static void delete(Statement myStmt, String sql) throws SQLException {
        myStmt.executeUpdate(sql);
        System.out.println("delete complete");
    }
}
