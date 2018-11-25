package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cliente;

public class ClienteDao {
	public void Adicionar(Cliente cliente){
		Connection connection = (Connection) GenericDao.getInstance().getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("EXEC sp_adicionaCliente "
					+ "?,?, ?, ?, ?, ?, ?, ?");
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCPF());
			ps.setString(3, cliente.getTelefoneResidencia());
			ps.setString(4, cliente.getTelefoneCelular());
			ps.setString(5, cliente.getEndereco());
			ps.setString(6, cliente.getBairro());
			ps.setString(7, cliente.getCidade());
			ps.setString(8, cliente.getEstado());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
