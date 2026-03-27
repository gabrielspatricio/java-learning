package com.java;

public class Conta {

	int numero;
	double saldo;
	
	Cliente cliente = new Cliente();
	
	
	
	
	
	
	//mostrando criação de métodos - VÍDEO 4;

	public double recuperarSaldo() {
		return saldo;
	}

	public void depositar (double valor) {
		saldo += valor;
	}
	
	
	//mostrando sobrecarga de métodos - VÍDEO 5;
	
	public void retirar (double valor) {
		saldo = saldo - valor;
	}
	
	public void retirar (double valor, double taxa) {
		saldo = saldo - valor - taxa;
	}
	
	//para se fazer sobrecarga, é preciso levar em consideração as assinaturas, ja q é dessa forma que o java irá diferenciar cada métodos. São compostas pelo nome, número e os tipos de dados dessa lista de argumentos.

	//porém, eu também posso ter atributos e variáveis com o mesmo nome
	
	int agencia; //esse agencia é parte de uma característica de uma conta.
	
	public void setAgencia(int agencia) { //esse agencia é uma variavel como parametro de um metodo setAgencia.
		this.agencia = agencia;
	}
	
	//esse metodo é para realizar uma alteração de uma agencia de uma conta, e para realizar essa alteracao, é necessário do numero da agencia definida no escopo, ou seja, quando usamos o this, queremos dizer que o parametro agencia do metodo vai receber o valor do agencia no escopo da conta.
	
}
