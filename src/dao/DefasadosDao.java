package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Eletronicos_Defasados;

public class DefasadosDao {
	public void Adicionar(Eletronicos_Defasados eletronico_defasado){
		Connection connection = (Connection) GenericDao.getInstance().getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("EXEC sp_adicionardefasado ?, ?");
			ps.setString(1, eletronico_defasado.getModelo());
			ps.setString(2, eletronico_defasado.getRazao());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
