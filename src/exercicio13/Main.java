package exercico13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws ParseException {

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date date = sdf.parse("2019-12-12");
		Endereco endereco = new Endereco("rua 1", "cidade 1", "provincia 1", " bairro 1", 1);
		Pessoa pessoa = new Pessoa("Pessoa 1", endereco, date);

		Date date2 = sdf.parse("2019-12-12");
		Endereco endereco2 = new Endereco("rua 2", "cidade 2", "provincia 2", " bairro 2", 2);
		Pessoa pessoa2 = new Pessoa("Pessoa 2", endereco2, date2);

		Date date3 = sdf.parse("2019-12-12");
		Endereco endereco3 = new Endereco("rua 3", "cidade 3", "provincia 3", " bairro 3", 3);
		Pessoa pessoa3 = new Pessoa("Pessoa 3", endereco3, date3);

		pessoas.add(pessoa);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		int numero = 0;

		while (numero != 5) {
			String string = JOptionPane.showInputDialog(
					"Menu Principal \n 1- Cadastrar Pessoa \n 2-Remover Pessoa \n 3-Modificar Pessoa \n 4-Exibir Pessoa \n 5-Sair ");
			numero = Integer.parseInt(string);
			switch (numero) {
			case 1:
				String nome = JOptionPane.showInputDialog("Insira o nome da Pessoa");
				String aniversario = JOptionPane.showInputDialog(
						"Insira a data de aniversario \n N.B: coloque no formato ano-mes-dia ex: 2000-01-01");
				String rua = JOptionPane.showInputDialog("Insira a rua de residencia");
				String cidade = JOptionPane.showInputDialog("Insira a cidade de residencia");
				String provincia = JOptionPane.showInputDialog("Insira a provincia de residencia");
				String bairro = JOptionPane.showInputDialog("Insira o bairro de residencia");
				String numer = JOptionPane.showInputDialog("Insira o numero da residencia");

				Endereco end = new Endereco(rua, cidade, provincia, bairro, Integer.parseInt(numer));
				Pessoa person = new Pessoa(nome, end, sdf.parse(aniversario));

				pessoas.add(person);

				break;
			case 2:
				String index_person = "";

				for (int i = 0; i < pessoas.size(); i++) {
					Pessoa pessoa4 = pessoas.get(i);
					if (i == pessoas.size() - 1) {
						index_person = index_person + i + pessoa4.getNome();
					} else {
						index_person = index_person + i + pessoa4.getNome() + "\n";
					}
				}

				String indexStr = JOptionPane.showInputDialog("Escolha o Indice de quem remover \n " + index_person);

				int index = Integer.parseInt(indexStr);
				pessoas.remove(index);

				break;

			case 3:

				index_person = "";

				for (int i = 0; i < pessoas.size(); i++) {
					Pessoa pessoa4 = pessoas.get(i);
					if (i == pessoas.size() - 1) {
						index_person = index_person + i + pessoa4.getNome();
					} else {
						index_person = index_person + i + pessoa4.getNome() + "\n";
					}
				}

				indexStr = JOptionPane.showInputDialog("Escolha o Indice de quem quer modificar \n " + index_person);

				index = Integer.parseInt(indexStr);

				nome = JOptionPane.showInputDialog("Insira o nome da Pessoa");
				aniversario = JOptionPane.showInputDialog(
						"Insira a data de aniversario \n N.B: coloque no formato ano-mes-dia ex: 2000-01-01");
				rua = JOptionPane.showInputDialog("Insira a rua de residencia");
				cidade = JOptionPane.showInputDialog("Insira a cidade de residencia");
				provincia = JOptionPane.showInputDialog("Insira a provincia de residencia");
				bairro = JOptionPane.showInputDialog("Insira o bairro de residencia");
				numer = JOptionPane.showInputDialog("Insira o numero da residencia");

				end = new Endereco(rua, cidade, provincia, bairro, Integer.parseInt(numer));

				pessoas.get(index).setNome(nome);
				pessoas.get(index).setAnoNascimento(sdf.parse(aniversario));
				pessoas.get(index).setEndereco(end);

				break;

			case 4:

				index_person = "";

				for (int i = 0; i < pessoas.size(); i++) {
					Pessoa pessoa4 = pessoas.get(i);
					if (i == pessoas.size() - 1) {
						index_person = index_person + i + "  " + pessoa4.getNome();
					} else {
						index_person = index_person + i + "  " + pessoa4.getNome() + "\n";
					}
				}

				indexStr = JOptionPane.showInputDialog("Escolha o Indice de quem quer Exibir \n " + index_person);

				index = Integer.parseInt(indexStr);

				JOptionPane.showMessageDialog(null, "" + pessoas.get(index).toString());

				break;

			case 5:
				break;

			default:
				break;
			}
		}
	}

}
