package model;

public class EletronicoOS {

	private int OS;
	private String modelo_eletronico;
	private String acessorio;
	private int observacao;

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

	public int getObservacao() {
		return observacao;
	}

	public void setObservacao(int observacao) {
		this.observacao = observacao;
	}

}
