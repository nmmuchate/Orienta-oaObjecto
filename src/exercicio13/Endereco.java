package exercico13;

public class Endereco {

	private String rua, cidade, provincia, bairro;
	private int numero;

	public Endereco() {
		super();
	}

	public Endereco(String rua, String cidade, String provincia, String bairro, int numero) {
		super();
		this.rua = rua;
		this.cidade = cidade;
		this.provincia = provincia;
		this.bairro = bairro;
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cidade=" + cidade + ", provincia=" + provincia + ", bairro=" + bairro
				+ ", numero=" + numero + "]";
	}

}
