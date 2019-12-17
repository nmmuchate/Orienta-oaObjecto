package exercicio14;

public class FacturaTeste {

	public static void main(String[] args) {
		Factura factura1 = new Factura("1", "Alguma Coisa", 10, -5);
		System.out.println(factura1.getTotalFactura());

		Factura factura2 = new Factura("1", "Alguma Coisa", 10, 60);
		System.out.println(factura2.getTotalFactura());
	}
}
