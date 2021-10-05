package StipendiaWeb;

import java.sql.*;
import javax.swing.*;
public class db {
    
    Connection conn=null;
    public static Connection java_db(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            // cambiar ruta de base de datos
            Connection conn =DriverManager.getConnection("jdbc:sqlite:D:\\Users\\Artemis\\Downloads\\StipendiaWeb Tesis\\StipendiaWeb\\StipendiaWeb - copia\\empnet.sqlite");
            
            return conn;
         
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
