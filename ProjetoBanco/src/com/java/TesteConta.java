package com.java;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Gabriel";
		contaCorrente.cliente.idade = 17; 
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 30;
		contaPoupanca.cliente.nome = "Alessandro";
		contaPoupanca.cliente.idade = 45;
		
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 40;
		contaInvestimento.cliente.nome = "Karla";
		contaInvestimento.cliente.idade = 46;
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);
		
		System.out.println();
		System.out.println();
		
		System.out.println(contaPoupanca.numero);
		System.out.println(contaPoupanca.saldo);
		System.out.println(contaPoupanca.cliente.nome);
		System.out.println(contaPoupanca.cliente.idade);
		
		System.out.println();
		System.out.println();
		
		System.out.println(contaInvestimento.numero);
		System.out.println(contaInvestimento.saldo);
		System.out.println(contaInvestimento.cliente.nome);
		System.out.println(contaInvestimento.cliente.idade);
		
	}
}
