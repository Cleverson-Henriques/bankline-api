package com.dio.santander.bankline.api.model;

public class Movimentaçao {
	private Integer id;
	private localDataTime dataHora;
	private String descricao;
	private Double valor;
	private MovimentaçaoTipo tipo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public localDataTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(localDataTime dataHora) {
		this.dataHora = dataHora;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public MovimentaçaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentaçaoTipo tipo) {
		this.tipo = tipo;
	}

}
