
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
       private static final String url = "jdbc:mysql://localhost:3306/Uc11";
    private static final String user = "root";
    private static final String password = "Luc@s2024";

    private static Connection conn;

    public static Connection getConnection() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (conn == null) {

                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else {
                return conn;
            }
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        }
           return null;
    }

}

           
     
