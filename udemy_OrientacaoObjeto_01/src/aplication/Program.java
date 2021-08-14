/*
Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.

Enter rectangle width and height:
3.00
4.00
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00
*/

package aplication;
import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		
		
		
		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
	
		
		System.out.printf("AREA = %.2f%n",  rect.area());
		System.out.printf("PERIMETER = %.2f%n" , rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n" , rect.diagonal());
		
	
		sc.close();
	}

}
