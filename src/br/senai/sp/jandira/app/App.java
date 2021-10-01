package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		Cliente titular = new Cliente();
		
		contaMaria.titular = "Maria Antonieta";
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		contaMaria.setNumeroAgencia("4214-9");
		
		System.out.println(contaMaria.getTipo());
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.titular = "Pedro Cabral";
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setNumeroAgencia("4214-9");
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.titular = "Ana Gomes";
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setNumeroAgencia("4214-9");
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		// Depositar 100 reais na conta da Maria
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();
		
		// Sacar 100 reais da conta da Maria
		contaMaria.sacar(100);
		contaMaria.exibirDetalhes();
		
		// Transferir 200 reais da conta da Maria para a Ana
		contaAna.transferir(contaMaria, 1999);
		contaMaria.exibirDetalhes();
		contaAna.exibirDetalhes();
		
	}
	}
