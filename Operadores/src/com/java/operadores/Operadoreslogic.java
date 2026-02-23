package com.java.operadores;

public class Operadoreslogic {

	public static void main(String[] args) {
		
		int idade = 20;
		boolean precisaVotar = idade >= 18 && idade < 70;
		
		System.out.println(precisaVotar);
		
		//sistema futebol
		
		int nramrl = 2;
		int nrvrml = 1;
		
		boolean suspenso = nramrl == 2|| nrvrml == 1;
		
		System.out.println(suspenso);
		
		
		//operador XOR é exclusivo, porque somente uma das comparações tem que ser verdadeira para ele receber o valor true.
		
		int x = 9, y = 11;
		
		boolean teste = x > 10 ^ y > 10;
		
		System.out.println(teste);
		
		//operador ! inverte o resultado do boolean. Ele "nega" a informação.
		
		boolean maiorIdade = !(idade >= 18);
		System.out.println(maiorIdade);
	}
}
