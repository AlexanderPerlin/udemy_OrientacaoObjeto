package application;

import java.util.Scanner;

import utilitario.Calculator;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// criação de nova instancia como variavel calc para classe Calculator
		Calculator calc = new Calculator();

		System.out.printf("Digite o valor do raio: ");
		double raio = sc.nextDouble();

		// variavel circ recebe valor do metodo circunferencia da instancia criada calc
		double circ = calc.circunferencia(raio);
		double vol = calc.volume(raio);

		System.out.printf("\nCircunferencia: %.2f%n", circ);
		System.out.printf("\nVolume: %.2f%n", vol);
		System.out.printf("\nValor de PI: %.2f%n", Calculator.PI);

		sc.close();
	}

}
