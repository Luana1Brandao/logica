package modelo;

import java.util.Scanner;

public class mult {
	
	public static Scanner entrada;

	public static void main(String[] args) {
	
		entrada = new Scanner (System.in);
		int val1 , val2 , result;
		
		System.out.print("insira aqui um valor inteiro:");
			val1 = entrada.nextInt();
		
		System.out.println("digite outro valor:");
			val2 = entrada.nextInt();
		 
		 
				result = val1 * val2;
				
				System.out.println("o resultado da divis�o �:" + result);

	}

}
