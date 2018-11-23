package model;

import java.util.Date;

public class OrdemdeServico {

	private int numeroOS;
	private Date data_inicio;
	private Date data_fim;
	private double valor;
	private int numero;

	public void setNumeroOS(int numeroOS) {
		this.numeroOS = numeroOS;
	}

	public int getNumeroOS() {
		return numeroOS;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
