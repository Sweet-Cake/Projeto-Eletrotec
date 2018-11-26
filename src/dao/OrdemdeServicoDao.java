package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.EletronicoOS;
import model.OrdemdeServico;



public class OrdemdeServicoDao {
	public void AdicionarOS(OrdemdeServico os){
		Connection connection = (Connection) GenericDao.getInstance().getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into ordemservico "
					+ "(id, cpfCliente, dataInicio, estadoOS) values "
					+ "(?, ?, GETDATE(), 'Aberto')");
			ps.setInt(1, os.getNumeroOS());
			ps.setString(2, os.getCpf());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void AdicionarEletronicosOS(EletronicoOS eos){
		Connection connection = (Connection) GenericDao.getInstance().getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("exec sp_adicionarEletronicos "
					+ "?, ?, ?, ?, ?, ?");
			ps.setInt(1, eos.getOS());
			ps.setString(2, eos.getModelo_eletronico());
			ps.setString(3, eos.getTipo());
			ps.setString(4, eos.getAparelho());
			ps.setString(5, eos.getAcessorio());
			ps.setString(6,  eos.getObservacao());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
