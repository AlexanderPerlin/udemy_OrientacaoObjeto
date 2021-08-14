/*
 * Conceitos base para comunica��o Diffie-Hellman.
 * 
 * - Esta ferramenta serve somente para troca de chaves entre as partes
 *   n�o sendo respons�vel pela criptografia da mensagem.
 *   
 * - As partes devem ter em negocia��o dois n�meros em comum: Um inteiro e outro Primo.
 * 
 * - Cada uma das partes deve escolher um n�mero secreto, que n�o ser� compartilhado.
 * 	 
 * F�rmula:
 * 
 * gx(mod n)
 * 
 * g = n�mero inteiro definido entre as partes
 * x = g � elevado ao expoente secreto defido individualmente
 * n = n�mero primo definido entre as partes
 */


import java.math.BigInteger;
import java.util.Scanner;
public class Chave {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Definir inteiro em comum");
		int i = sc.nextInt();
		
		System.out.println("Definir primo em comum");
		int p = sc.nextInt();
		
		System.out.println("Definir expoente secreto");
		int x = sc.nextInt();
		sc.close();
		
		BigInteger exp = BigInteger.valueOf(i).pow(x);
		BigInteger chave = exp.mod(BigInteger.valueOf(p));

		System.out.println(chave);
		
	

	}

}
