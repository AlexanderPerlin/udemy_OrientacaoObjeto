package application;

import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159; // valor estatico
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double circ = circunferencia(raio); // chama metodo circunferencia 
		double vol = volume(raio);
		
		System.out.printf("\nCircunferencia: %.2f%n", circ);
		System.out.printf("\nVolume: %.2f%n", vol);
		System.out.printf("\nValor de PI: %.2f%n", PI);
		
		
		
sc.close();
	}
	// Na mesma classe estatica(main) não se pode chamar um metodo que não seja estatico
	public static double circunferencia (double raio) {
		return 2 * PI * raio;
	}
	
	public static double volume (double raio) {
		return 4 * PI * raio*raio*raio/3;
	}

}
