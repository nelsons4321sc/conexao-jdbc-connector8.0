package br.com.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaMySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexao = null;
		try{
			String url = "jdbc:mysql://localhost/agenda?useTimezone=true&serverTimezone=UTC";
			String usuario = "root";
			String senha = "senha do root";
			conexao  = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conectou");
			conexao.close();
		}catch(SQLException e){
			System.out.println("Ocorreu um erro ao criar a conexão. Erro: "+ e.getMessage());
		}
		
	}

}
