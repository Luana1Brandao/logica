package tarerfa;
import java.util.Scanner;


public class Solu��o2 {

	public static void main(String[] args) {
		/** 2 � Desenvolva um programa que leia a velocidade de um carro (km/h) e a dist�ncia(Km)
		 *  a ser percorrida (km) por ele. Calcule e apresente na tela, quanto tempo (horas)
		 *   ser� necess�rio para o carro percorrer a dist�ncia informada. 
			V=D/T -> T = D/V
		*/
		
		Scanner imput = new Scanner(System.in);
		Double V, D, T;
		
		System.out.print("Insira a Velocidade em km/h:");
		V= imput.nextDouble();
		
		System.out.print("Insira a Dist�ncia em km:");
		D= imput.nextDouble();
		
		T = D/V;
		
		//sa�da
		
		System.out.printf("O carro percorrer� seu trajeto em: %.0f hora(s)" , T );
		
		
	}

}
