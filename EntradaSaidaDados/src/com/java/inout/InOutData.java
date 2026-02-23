package com.java.inout;

import java.util.Scanner; //Aqui estou importando a classe Scanner do pacote java.util para mim conseguir utilizá-la.

public class InOutData {

	public static void main(String[] args) {
		
		int idade = 20;
		
		Scanner sc = new Scanner (System.in); //chamei a classe scanner, dei o nome de sc e atribui um objeto à ela.
		
		System.out.println("Digite seu primeiro nome: ");
		String nome = sc.next(); //o next obtém só uma palavra
		
		sc.nextLine(); //ele limpa o enter, porque quando eu clico, o enter vai como um valor de entrada pra próxima pergunta!
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = sc.nextLine(); //o nextline obtém a linha toda
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();

		if (idade <=0) 
			System.out.println("Idade inválida");

		if(idade >= 18 && idade < 70) {
			System.out.println("Maior idade");
		} else if (idade >= 70){
			System.out.println("Terceira idade");
			if (idade >= 100) {
				System.out.println("Centenário");
			}
		} else if (idade < 18 && idade > 0){
			System.out.println("Menor idade");
		}
	}

}