package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.OrdemdeServicoDao;
import model.Eletronico;
import model.EletronicoOS;
import model.OrdemdeServico;

/**
 * Servlet implementation class ControleOS
 */
@WebServlet("/ControleOS")
public class ControleOS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleOS() {
        super();
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
		List<EletronicoOS> le = (List<EletronicoOS>)getServletContext().getAttribute("LE");
		if (le == null){
			le = new ArrayList<EletronicoOS>();
			getServletContext().setAttribute("LE", le);
		}
		String cmd = request.getParameter("cmd");
		switch(cmd){
		case "adicionar":
			AdicionarEletronico(request, response);
			break;
		case "Enviar":
			SalvarOS(request, response);
		}
	}

	protected void AdicionarEletronico(HttpServletRequest request, HttpServletResponse response){
		List<EletronicoOS> le = (List<EletronicoOS>)getServletContext().getAttribute("LE");
		//PrintWriter out = response.getWriter();
		EletronicoOS eletronicoOS = new EletronicoOS();
		eletronicoOS.setOS(Integer.parseInt(request.getParameter("numos")));
		//System.out.println(Integer.parseInt(request.getParameter("numos")));
		eletronicoOS.setAparelho(request.getParameter("aparelho"));
		eletronicoOS.setModelo_eletronico(request.getParameter("modelo"));
		eletronicoOS.setTipo(request.getParameter("tipo"));
		eletronicoOS.setObservacao(request.getParameter("obs"));
		eletronicoOS.setAcessorio(request.getParameter("acessorio"));
		le.add(eletronicoOS);
		for (EletronicoOS eos : le){
		System.out.println(eos.getModelo_eletronico());}
		getServletContext().setAttribute("LE", le);
	}
	
	protected void SalvarOS(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<EletronicoOS> le = (List<EletronicoOS>)getServletContext().getAttribute("LE");
		OrdemdeServicoDao osdao = new OrdemdeServicoDao();
		OrdemdeServico os = new OrdemdeServico();
		os.setCpf(request.getParameter("cpf"));
		os.setNumeroOS(Integer.parseInt(request.getParameter("numos")));
		osdao.AdicionarOS(os);
		for (EletronicoOS eos : le){
			osdao.AdicionarEletronicosOS(eos);
			}
		le.clear();
	}
}
