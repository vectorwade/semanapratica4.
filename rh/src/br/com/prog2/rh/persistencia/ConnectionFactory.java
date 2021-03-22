package br.com.prog2.rh.persistencia;

public class ConnectionFactory {

	package br.com.prog2.rh.persistencia;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	public class ConnectionFactory {
		public static Connection getConnection() {
			String driver = "org.postgresql.Driver";
			String user = "postgres";/*Coloque o usu�rio criado para acesso
			ao banco*/
			String senha = "ifb";/*Coloque a senha para acesso ao banco*/
			String url = "jdbc:postgresql://127.0.0.1:5432/rh";/*Coloque o
			servidor onde est� instalado o banco*/
			Connection con = null;
			try {
			Class.forName(driver);
			con = (Connection) DriverManager.getConnection(url, user,
			senha);
			} catch (ClassNotFoundException ex) {
			System.err.print(ex.getMessage());
			} catch (SQLException e) {
			System.err.print(e.getMessage());
			}
			return con;
			}
			public static void close(Connection con){
			try{
			con.close();
			}catch(SQLException e){
			}
			}
			}
}
