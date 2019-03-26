/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

/**
 *
 * @author Banele
 */
import java.io.*;
import java.sql.*;
import java.util.*;
public class DatabaseConnection {
    public static Statement statement = null;
    public static ResultSet resultset = null;
    public static Connection connection = null;
    public static PreparedStatement prepStatement = null;
    
    /**
     * This method will connect to the local MySQL database
     * It will also insert the individual stock items into the stock database table
     * @throws java.sql.SQLException
     */
    public static void connection() throws SQLException{
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/3306/restaurant", "root", "B!n@ryM@n01");
            // call method that will read the sql script from restaurant.sql
            // String sql = DatabaseConnection1.getSqlScript();
            // create a prepared statement
            // prepStatement = connection.prepareStatement(sql);
            // Execute SQL query
            // prepStatement.executeUpdate();
            
            // inserting all the individual menu items into the stock table and initialising the stock to zero
            String itemName[] = {"White cheese", "Parmesan cheese", "Cheese","Beef",
                "Chicken breast","Chicken strips","Calamari","Blue point oyster","Shrimp",
                "Crawfish","Garlic bread","Crouton","Green leaf lettuce","Red leaf lettuce",
                "Romaine lettuce","Gherkins","Caesar dressing","Cucumber","Carrot","Red onion",
                "White onion","Roma tomatoes","Black-eyed peas", "Black pepper"};
            
            for (int a = 0; a < itemName.length; a++) {
                // create a prepared statement
                prepStatement = connection.prepareStatement(
                        "INSERT INTO restaurant.stock (restaurant.stock.item_name, restaurant.stock.usage)\n" +
                        "VALUES (?, ?);");
                
                // Execute SQL query
                prepStatement.setString(1, itemName[a]);
                prepStatement.setInt(2, 0);
                prepStatement.execute();
            }
            System.out.println("Database connection established and stock table initial data inserted");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    /**
     * This method will read the restaurant.sql scrip that contains all the code
     * for creating database, tables and relationships
     */ 
    public static String getSqlScript(){
        String path = "C:\\Users\\Shaun\\Documents\\PROGRAMMING\\Java\\Projects\\SchoolWork\\New syllabus\\ADT_AssignmentOne\\ADT_AssignmentOne\\src\\BackEnd\\restaurant.sql";
        String script = "";
        try{
            FileReader fileReader = new FileReader(new File(path));
            Scanner scn = new Scanner(fileReader);
            while(scn.hasNext()){
                script += scn.nextLine()+"\n";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return script;
    }
    
    /**
     * This method will record all the data for all users who are registering into the application
     * I will use the Variable Arguments (Varargs) as there maybe an arbitrary number of values in some methods
     * and I am actually lazy to type all of the arguments in this method.
     * @param newUser
     * @throws java.sql.SQLException
     */
    public static void registerUser(String... newUser) throws SQLException{
        try{
            prepStatement = connection.prepareStatement("INSERT INTO restaurant.user(restaurant.user.name, restaurant.user.surname, "+ 
                    "restaurant.user.title, restaurant.user.username, restaurant.user.password VALUES(?, ?, ?, ?, ?)");
            prepStatement.setString(1, newUser[0]);
            prepStatement.setString(2, newUser[1]);
            prepStatement.setString(3, newUser[2]);
            prepStatement.setString(4, newUser[3]);
            prepStatement.setString(5, newUser[4]);
            System.out.println(newUser[0]+" has been registered successfully");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /**
     * This method will verify the log in details of the user
     * @param username
     * @param password
     * @param title
     * @return 
     * @throws java.sql.SQLException 
     */
    public static boolean verifyUser(String username, String password, String title) throws SQLException{
        boolean verify = false;
        try{
            // creating the statement
            statement = connection.createStatement();
            // execute the sql query
            resultset =  statement.executeQuery("SELECT restaurant.user.name, restaurant.user.password FROM restaurant.user");
            // processing the results to very the entered login details
            while(resultset.next()){
                verify = ((resultset.getString("restaurant.user.username").equals(username)) &&
                        (resultset.getString("restaurant.user.password").equals(password)) &&
                        (resultset.getString("restaurant.user.title").equals(title)));
            }
            System.out.println("User verification executed");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return verify;
    }

    /**
     * This method will return all the amount of users that exist in the user database table
     * @return 
     * @throws java.sql.SQLException 
     */
    public static int howManyUsers() throws SQLException{
        int totalUsers = 0;
        try{
            // creating the statement
            statement = connection.createStatement();
            // execute the sql query
            resultset=  statement.executeQuery("SELECT * FROM restaurant.user");
            // processing the results to very the entered login details
            while(resultset.next()){
                totalUsers++;
            }
            System.out.println("total user calculation executed");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return totalUsers;
    }
}
