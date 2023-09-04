
package universidadejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class UniversidadEjemplo {
    public static void main(String[] args) {
        System.out.println("Hola");
        try {
            //cargar driver
            Class.forName("org.mariadb.jdbc.Driver");
            
            Connection conexion =DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidad_ulp", "root","");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el driver "+ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion "+ex.getMessage());
        }
    }

}
