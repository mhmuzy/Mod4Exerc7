package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try {
			int elev, num1, num2;
			double squart1, squart2, squartCub1, squartCub2;
			
			Scanner teclado = new Scanner(System.in);
			
		System.out.println("");
		System.out.println("       Hitss Treinamento");
		System.out.println("");
		System.out.println("Digite o 1� n�mero:");
		System.out.println("");
		num1 = teclado.nextInt();
		System.out.println("");
		System.out.println("Digite o 2� n�mero:");
		System.out.println("");
		num2 = teclado.nextInt();
		System.out.println("");
		
		elev = num1 ^ num2;
		squart1 = Math.sqrt(num1);
		squart2 = Math.sqrt(num2);
		squartCub1 =  Math.cbrt(num1);
		squartCub2 = Math.cbrt(num2);
		System.out.println("         Resultado do Processamento");
		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("O 1� n�mero elevado ao 2� n�emro �: " + elev);
		System.out.println("A Raiz quadrada do 1� n�mero �: " + squart1);
		System.out.println("A Raiz quadrada do 2� n�mero �: " + squart2);
		System.out.println("A Raiz c�bica do 1� n�mero �: " + squartCub1);
		System.out.println("A Raiz c�bica do 2� n�mero �: " + squartCub2);
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.println("Fim do programa.");
		} catch (Exception e) {
			System.out.println("Erro de processamento : " + e.getMessage());
		}
	}
}
