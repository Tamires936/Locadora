
package locadoraaction2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LocadoraAction2 {


    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
      public boolean conectar(){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cenaflix_bd", "root","826390T98#10t11");
            return true;
        }catch(ClassNotFoundException | SQLException ex){
            return false;
        }
    }
        
    }
    

