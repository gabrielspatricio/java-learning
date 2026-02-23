package com.java.operadores;

public class Operador { 

	public static void main(String[] args) {



		//parte operadores aritméticos;

		int x = 5;
		int y = 10;
		int z = 15;

		int result = x + y;
		System.out.println(result);

		result = x - y;
		System.out.println(result);

		result = x * y;
		System.out.println(result);

		result = x / y;
		System.out.println(result);

		result = x % y;
		System.out.println(result);

		result = z - x + y * (x/y);
		System.out.println(result);



		//Parte operador de atribuição:

		System.out.println();
		System.out.println();


		int a = 10;
		a = a + 10;

		System.out.println(a);

		a = 10;

		a += 10; //isso é a mesma coisa q a linha de cima;

		System.out.println(a);



		//Parte operadores de incremento e decremento;

		System.out.println();
		System.out.println();

		int b = 10;
		b += 1;
		b = 10;

		b++; //isso é a mesma coisa que b += 1;

		System.out.println("b = " + b);

		int c = 5;
		c--; //isso é igual a c menos 1;

		System.out.println("c = " + c);

		//se eu inverter da na mesma:

		++b;
		--c;


		//mais um exemplo:

		int m = 10, n = 5, o = 5;

		m = n++;

		System.out.println();
		System.out.println();

		System.out.println("m = " + m);
		System.out.println("n = " + n);

		m = --o;

		System.out.println("m = " + m);
		System.out.println("o = " + o);



		//Operadores de igualdade e relacionais

		System.out.println();
		System.out.println();

		int idade = 17;
		boolean maioridade = idade >= 18;
		boolean maioridade2 = idade == 17;
		boolean maioridade3 = idade != 17;

		System.out.println(maioridade);
		System.out.println(maioridade2);
		System.out.println(maioridade3);







	}

}
