package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.AcaoBolsa;
import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteImposto {
	
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(0, 0);
		conta.deposita(10000);
		
		AcaoBolsa acao = new AcaoBolsa();
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calImp = new CalculadorImposto();
		Double imposto = calImp.calculaImposto(conta);
		System.out.println("Imposto CC: "+imposto);
		
		imposto = calImp.calculaImposto(acao);
		System.out.println("Imposto CC + Acao: "+imposto);
		
		imposto = calImp.calculaImposto(seguro);
		System.out.println("Imposto CC + Acao + Seguro: "+imposto);
	}
}
