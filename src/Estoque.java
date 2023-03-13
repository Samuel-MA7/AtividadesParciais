import java.util.ArrayList;

public class Estoque {
	
	private ArrayList<Produto> produtos;
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public String mostrarQuantEstoque(Produto p, int quantidadeEstoque) {
		quantidadeEstoque = p.getQuantidade();
		return "Quantidade do Estoque= " + quantidadeEstoque;
	}
	
	public void adicionarProduto(Produto p) {
		this.produtos.add(p);
		System.out.println("Produto adicionado ao estoque.");
	}
	
	public void retirarProduto(Produto p) {
		this.produtos.remove(p);
		System.out.println("Produto removido do estoque.");
	}
	
}
