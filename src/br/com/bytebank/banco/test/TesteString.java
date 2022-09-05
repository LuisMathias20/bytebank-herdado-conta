package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteString {

	public static void main(String[] args) {
		int a = 3;
		String nome = "Alura";
		
		nome = nome.replace("A", "a");
		
		ContaCorrente CC = new ContaCorrente(11, 12);
		ContaPoupanca CP = new ContaPoupanca(34, 45);
		
		println(CC.toString());
		println(CP.toString());
		
		System.out.println(nome);
	}
	
	static void println(Object objeto) {
		System.out.print(objeto);
	}
}
