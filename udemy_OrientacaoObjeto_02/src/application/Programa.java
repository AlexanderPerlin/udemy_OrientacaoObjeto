package application;

import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 
		nome da classe(Produto) + 
		vari�vel criada(equipamento) + 
		chamada para nova instancia new Produto()
		sintaxe: Classe vari�vel = new Classe();
		*/
		Produto equipamento = new Produto();
		
		System.out.print("Nome: ");
		equipamento.nome = sc.nextLine(); // vari�vel + atributo da classe Produto
		System.out.print("Pre�o: ");
		equipamento.preco = sc.nextDouble();
		System.out.println("Quantidade");
		equipamento.quantidade = sc.nextInt();
		
		equipamento.valorEstoque();
		
		System.out.println(equipamento.toString());
		
		System.out.println();
		System.out.print("Entre com a quantidade adicionada ");
		int update = sc.nextInt();
		
		equipamento.addProduto(update);
		System.out.println(equipamento.toString());
		
		System.out.println();
		System.out.print("Entre com a quantidade retirada ");
		update = sc.nextInt();
		
		equipamento.removeProduto(update);
		
		System.out.println(equipamento.toString());
		
		sc.close();
	}

}
