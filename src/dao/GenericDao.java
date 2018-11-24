package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
public class GenericDao {

	private final static String USERNAME = "user";
	private final static String PASSWORD = "123456";
	private final static String URLDB = "jdbc:jtds:sqlserver://localhost:53463/Eletrotec;instance=SQLEXPRESS;";
	private static GenericDao instancia;
	private Connection con;

	private GenericDao() {
		
		//Conexão raíz = Class.forName("net.sourceforge.jtds.jdbc.Driver")
		// Conexão nutella = Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con = DriverManager.getConnection(URLDB, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static GenericDao getInstance() {
		if (instancia == null)
			instancia = new GenericDao();
		return instancia;
	}

	public Connection getConnection() {
		return con;
	}
}