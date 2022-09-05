package br.com.bytebank.banco.modelo;

public class CalculadorImposto {

	private double totalImposto;
	
	public double calculaImposto(Tributavel imposto) {
		totalImposto += imposto.getValorImposto();
		
		return totalImposto;
	}
}
