package entidades;

public class Produto {
	
	public String nome;
	public double preco ;
	public int quantidade;

	//Trecho que se expressa as fun��es da classe Produto
	
	public double valorEstoque() {
		return  preco*quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade = this.quantidade+quantidade;
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade = this.quantidade-quantidade;
	}
	
	//M�todo toString pertencente � classe Object
	public String toString() { 
		return "Produto: "+nome 
						  +"\nPre�o: R$ " +String.format("%.2f",preco) 
						  +"\nQuantidade: " +quantidade
						  +"\nValor total em estoque: "+String.format("%.2f",valorEstoque()) ;
		
	}
}
