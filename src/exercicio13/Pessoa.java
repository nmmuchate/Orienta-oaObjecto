package exercico13;
import java.util.Date;

public class Pessoa {

	private String nome;
	private Endereco endereco;
	private Date anoNascimento;

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, Endereco endereco, Date anoNascimento) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Date getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Date anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", \n endereco=" + endereco.toString() + ",\n anoNascimento=" + anoNascimento
				+ "]";
	}

}
