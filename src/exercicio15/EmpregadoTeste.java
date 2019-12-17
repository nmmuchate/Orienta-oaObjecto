package exercicio15;

public class EmpregadoTeste {

	public static void main(String[] args) {

		Empregado empregado1 = new Empregado("Ivandro", "Bangal", 150000);
		Empregado empregado2 = new Empregado("Nicolas", "Muchate", 50000);

		System.out.println("Salario do " + empregado1.getNome() + "  é : " + empregado1.getSalario_mensal());

		System.out.println("Salario do " + empregado2.getNome() + "  é : " + empregado2.getSalario_mensal());

		empregado1.setSalario_mensal(empregado1.getSalario_mensal() + empregado1.getSalario_mensal() * 0.1);
		empregado2.setSalario_mensal(empregado2.getSalario_mensal() + empregado2.getSalario_mensal() * 0.1);

		System.out.println("Salario do " + empregado1.getNome() + " após é : " + empregado1.getSalario_mensal());

		System.out.println("Salario do " + empregado2.getNome() + " após é : " + empregado2.getSalario_mensal());

	}

}
