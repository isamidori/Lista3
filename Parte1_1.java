import java.util.Scanner;

public class Parte1_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int condContinuacao = 0;

		System.out.println("N�meros de 1 at� onde vc informar");
		System.out.println("Informe o n�mero");
		condContinuacao = input.nextInt();

		contagemNumeros(condContinuacao);

	}

	public static void contagemNumeros(int condContinuacao) {

		for (int counter = 1; counter <= condContinuacao; counter++) {
			System.out.println(counter);

		}
	}

}