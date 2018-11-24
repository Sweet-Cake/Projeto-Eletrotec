package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DefasadosDao;
import model.Eletronicos_Defasados;

/**
 * Servlet implementation class ControleDefasados
 */
@WebServlet("/ControleDefasados")
public class ControleDefasados extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControleDefasados() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Eletronicos_Defasados eletronico = new Eletronicos_Defasados();
		eletronico.setModelo(request.getParameter("modelo"));
		eletronico.setRazao(request.getParameter("razao"));
		DefasadosDao ddao = new DefasadosDao();
		ddao.Adicionar(eletronico);
		response.getWriter().append("Modelo: "+eletronico.getModelo()+"<br>Razao: "+eletronico.getRazao());
		
	}

}
