package modelo;
import java.util.Scanner;

public class Div {
	
	public static Scanner entrada;
	
	public static void main (String [] args) {
		entrada = new Scanner (System.in);
		int val1, val2, result;
		
		System.out.print("digite um valor inteiro:");
		val1 = entrada.nextInt();
		
		System.out.print(" digite aqui outro valor");
		val2 = entrada.nextInt();
		
		
		result = val1 / val2;
		
		System.out.println("o primeiro valor dividido pelo segundo �:"+ result);
		
		
	}
	
	
	
}