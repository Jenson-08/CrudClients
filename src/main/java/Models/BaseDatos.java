/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jenso
 */
public class BaseDatos {
    private String db = "persona"; 			// cambiar
	private String usuario  = "root";
	private String contra = "root"; 			//  
	private String url = "jdbc:mysql://localhost:3306/" + db;
	private Connection con = null; //La variable obtiene la conexión y la guarda.
	
	
	public Connection conectar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // Controlador para realizar conexión.
			con = (Connection) DriverManager.getConnection(this.url, this.usuario, this.contra);
						
		} catch (SQLException e) {
			System.out.println("Error de Conexion!! " + e);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE,null, ex);
		}
		return con;	
	}
}
