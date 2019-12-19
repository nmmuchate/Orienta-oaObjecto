/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Vagabundo
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Pessoa ch = new Pessoa();
        
        System.out.println("Insira os Dados da pessoa");
        System.out.println("nome");
        ch.setNome(sc.next());
        System.out.println("numero de identidade");
        ch.setBi(sc.nextInt());
        System.out.println("E-mail");
        ch.setEmail(sc.next());
        System.out.println("Numero de celular");
        ch.setNumerodecelular(sc.next());
        
        System.out.println("Insira os dados do livro");
        Livro dc = new Livro();
        System.out.println("Edição");
        dc.setEdicao(sc.nextByte());
        System.out.println("Autor Do Livro");
        dc.setNomedoautor(sc.next());
        System.out.println("Titulo do Livro");
        dc.setTitulo(sc.next());
        
        Emprestimo hg = new Emprestimo();
        SimpleDateFormat fer = new SimpleDateFormat("yyyy-MM-dd");
        Date date = fer.parse("2019-12-19");
        hg.setDatadeemprestimo(date);
        System.out.println("Insira a data de entrega do livro.ex(yyyy-MM-dd)");
       // hg.setDatadeentrega(sc.());
        hg.setPessoa(ch);
        
        hg.setLivro(dc);
        System.out.println(hg);
       
    }
}
