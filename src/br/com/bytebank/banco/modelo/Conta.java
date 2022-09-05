package br.com.bytebank.banco.modelo;

/**
 * 
 * Classe que representa a moldura de uma conta
 * 
 * @author Luis Mathias
 *
 */
public abstract class Conta {

	protected double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;

	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é "+Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma nova conta: "+this.numero);
		
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: "+this.saldo+ ", Valor: "+valor);
		} 

		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero >= 0) {
			System.out.println("Conta não pode ter número negativo");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia >= 0) {
			System.out.println("Conta não pode ter número negativo");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numero=" + numero + ", agencia=" + agencia + ", titular=" + titular + "]";
	}
	
}
