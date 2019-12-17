package exercicio14;

public class Factura {

	private String numero, descricao;
	private int qtd_item;
	private double preco_item;

	public Factura(String numero, String descricao, int qtd_item, double preco_item) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.qtd_item = qtd_item;
		this.preco_item = preco_item;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtd_item() {
		return qtd_item;
	}

	public void setQtd_item(int qtd_item) {
		this.qtd_item = qtd_item;
	}

	public double getPreco_item() {
		return preco_item;
	}

	public void setPreco_item(double preco_item) {
		if (preco_item < 0) {
			this.preco_item = 0;
		} else {
			this.preco_item = preco_item;
		}
	}

	public double getTotalFactura() {
		double total = preco_item * qtd_item;

		if (total < 0) {
			return 0;
		} else {
			return total;
		}
	}

	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", descricao=" + descricao + ", qtd_item=" + qtd_item + ", preco_item="
				+ preco_item + "]";
	}

}
