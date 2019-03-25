/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Banele
 */
public class DatabaseConnection {
    public static void connection(){
        try{
            Statement statement = null;
            ResultSet resultset = null;
            Connection connection = null;
            PreparedStatement prepStatement = null;
            // connection to database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "B!n@ryM@n01");
            // call method that will read the sql script from restaurant.sql
            String sql = DatabaseConnection.getSqlScript();
            // create a prepared statement
            prepStatement = connection.prepareStatement(sql);
            // Execute SQL query
            prepStatement.executeUpdate();
            
            resultset.close();
            statement.close();
            connection.close();
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
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
    
    public static void main(String[]argrs){
        DatabaseConnection.connection();
    }
}
