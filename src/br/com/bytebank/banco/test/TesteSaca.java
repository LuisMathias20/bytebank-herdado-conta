package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(100);
		
		try {
			conta.saca(200);
		} catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}
}
