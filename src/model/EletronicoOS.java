package model;

public class EletronicoOS {

	private int OS;
	private String modelo_eletronico;
	private String acessorio;
	private String observacao;
	private String tipo;
	private String aparelho;
	
	public int getOS() {
		return OS;
	}

	public void setOS(int oS) {
		OS = oS;
	}

	public String getModelo_eletronico() {
		return modelo_eletronico;
	}

	public void setModelo_eletronico(String modelo_eletronico) {
		this.modelo_eletronico = modelo_eletronico;
	}

	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String string) {
		this.observacao = string;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAparelho() {
		return aparelho;
	}

	public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	}
	
}
