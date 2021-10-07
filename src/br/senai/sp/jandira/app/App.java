package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Criar variaveis de referencia e objetos
		Cliente clienteMaria = new Cliente();
		Cliente clientePedro = new Cliente();
		Cliente clienteAna = new Cliente();
		Conta contaMaria = new Conta("7845-8");
		Conta contaPedro = new Conta("6547-6");
		Conta contaAna = new Conta("23145-9");
		Agencia agencia = new Agencia();
		
		// info agencia (igual para tds)
		agencia.setNumero("4214-9");
		agencia.setCidade("Jandira");
		agencia.setTelefone("4002-8922");
		agencia.setNomeGerente("Yudi");
		
		// Criação da conta da Maria
		contaMaria.setCliente(clienteMaria);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		contaMaria.setAgencia(agencia);
		
		// Criação da cliente Maria
		clienteMaria.setNome("Maria");
		clienteMaria.setEmail("maria.antonieta24@gmail.com");
		clienteMaria.setSalario(1500);
		
		// Criação da conta do Pedro
		contaPedro.setCliente(clientePedro);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setAgencia(agencia);
		
		// Criação cliente Pedro
		clientePedro.setNome("Pedro");
		clientePedro.setEmail("pedrocabraldasilva@gmail.com");
		clientePedro.setSalario(1200);
		
		// Criação da conta da Ana
		contaAna.setCliente(clienteAna);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setAgencia(agencia);
		
		// Criação da cliente Ana
		clienteAna.setNome("Ana");
		clienteAna.setEmail("ana_clara1996@hotmail.com");
		clienteAna.setSalario(2500);
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		// Depositar na conta da Maria
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();
		
		// Sacar da conta da Maria
		contaMaria.sacar(100);
		contaMaria.exibirDetalhes();
		
		// Transferir da conta da Maria para a Ana
		contaAna.transferir(contaMaria, 1999);
		contaMaria.exibirDetalhes();
		contaAna.exibirDetalhes();
		
	}
	}
