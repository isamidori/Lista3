import java.util.Scanner;

public class Parte1_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int condContinuacao = 0;
		
		System.out.println("Programa de um numero par at� outro");
		System.out.println("Informe um n�mero");
		condContinuacao = input.nextInt();
		
		
		contRegressivaPares (condContinuacao);

	}
	
	
	public static void contRegressivaPares (int condContinuacao) {
		for (int counter = condContinuacao;  counter >= 0 ; counter--) {
			if (counter %2 == 1) {
				System.out.println(counter);
			}
		}
		
	}

}
