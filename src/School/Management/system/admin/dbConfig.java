 
package School.Management.system.admin;

/**
 *
 * @author Beamtech
 */
import java.sql.*;

import javax.swing.JOptionPane;
public class dbConfig {
 public Connection con;
 public ResultSet rs;
 public Statement stmt;
 private final String path="jdbc:mysql://";
 private String database = "localhost:3306/wayward";
 private String username = "root";
 private String password = "Stano54402018";
 private String driver = "com.mysql.jdbc.Driver";
 
 public dbConfig() {
    
     try{
     Class.forName(driver);
     con=DriverManager.getConnection(path+database, username, password);
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"The following error occured "+e);
     }
    
       
     
 }
 public void Query1(String sql){
     try {
         stmt = con.createStatement();
         stmt.execute(sql);
         JOptionPane.showMessageDialog(null,"data added successfully");
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,ex);
     }
 }
 public void Query2(String Sql){
     try{
      stmt = con.createStatement();
      stmt.executeQuery(Sql);
     }catch(SQLException ex){
     
          JOptionPane.showMessageDialog(null,ex);
     }
 }
}
  

