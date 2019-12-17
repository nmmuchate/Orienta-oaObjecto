package exercicio15;

import java.util.Date;

public class Empregado {

	private String nome, sobrenome;

	private double salario_mensal;

	private Date dataInicio;

	public Empregado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empregado(String nome, String sobrenome, double salario_mensal) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario_mensal = salario_mensal;
	}

	public Empregado(String nome, String sobrenome, double salario_mensal, Date dataInicio) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario_mensal = salario_mensal;
		this.dataInicio = dataInicio;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario_mensal() {
		return salario_mensal;
	}

	public void setSalario_mensal(double salario_mensal) {
		this.salario_mensal = salario_mensal;
	}

}
