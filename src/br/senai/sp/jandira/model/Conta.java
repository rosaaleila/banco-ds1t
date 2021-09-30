package br.senai.sp.jandira.model;

public class Conta {
	
	public String tipo;
	private String numero;
	public String numeroAgencia;
	public String titular;
	private double saldo;
	
	// utilizar o mesmo n do atributo � boa pratica
	public Conta(String numeroConta, String tipoConta) {
		numero = numeroConta;
		tipo = tipoConta;
	}
	
	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			System.out.println("Valor inv�lido.");
		}
		else {
			saldo += valorDeposito;
		}
	}
	
	public boolean sacar(double valorSaque) {
		if (valorSaque < 0) {
			System.out.println("Valor inv�lido.");
			return false;
		}
		else if (valorSaque > saldo) {
			System.out.println("Saldo insuficiente.");
			return false;
		} else { 
			saldo -= valorSaque;
			return true;
		}
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		boolean resultado = sacar(valorTransferencia);
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("N�o foi poss�vel realizar a transa��o.");
		}
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
		System.out.println("---------------------");
		System.out.println();
	}
	
}
