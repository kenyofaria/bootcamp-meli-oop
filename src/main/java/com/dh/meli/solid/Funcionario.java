package com.dh.meli.solid;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Funcionario {

	private String nome;
	private Cargo cargo;
	private BigDecimal salario;
	private List<Reajuste> reajustes;
	private LocalDate dataEntrada;
	
	public Funcionario() {
		initReajustes();
	}

	
	public Funcionario(String nome, Cargo cargo, BigDecimal salario, LocalDate dataEntrada) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		initReajustes();
	}
	
	public Funcionario(String nome, Cargo cargo, BigDecimal salario, List<Reajuste> reajustes, LocalDate dataEntrada) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.reajustes = reajustes;
		this.dataEntrada = dataEntrada;
	}
	
	private void initReajustes() {
		this.reajustes = new ArrayList<Reajuste>();
	}
	
	public void reajustaSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}


	public Cargo getCargo() {
		return cargo;
	}


	public BigDecimal getSalario() {
		return salario;
	}
	
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	
	public BigDecimal getValorTotalEmReajustes(){
		BigDecimal total = this.reajustes.stream().map(r -> r.getValor()).reduce(new BigDecimal(0), BigDecimal::add);
		return total;
	}

}
