
package DB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DbConnect {
    static public Connection c;
    static public Statement st;
    static public PreparedStatement insertUser;
    static public PreparedStatement getUser;
    static public PreparedStatement executeUser;
    static{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","project","project");
            st=c.createStatement();
            insertUser=c.prepareStatement("insert into patient_info(patient_name,father_name,age,gender,mobile_no,today_date,blood_group,address,maritial_status)values(?,?,?,?,?,?,?,?,?)") ;
            getUser=c.prepareStatement("select * from patient_info where patient_name like ?");
            executeUser=c.prepareStatement("update patient_info set  patient_name=?,father name=?,age=?,gender=?,mobile no=?,today date=?,blood group=?,"
                    + "+address=?,maritial status=?");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog( null, ex);
        }
    }
    
    
}
