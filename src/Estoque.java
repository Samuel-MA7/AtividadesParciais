import java.util.ArrayList;

public class Estoque {
	
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public Estoque() {
		
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public void mostrarQuantEstoque(Produto p) {
		int quantidade = p.getQuantidade();
		System.out.println("Quantidade no Estoque= " + quantidade);
	}
	
	public void adicionarProduto(Produto p) {
		this.produtos.add(p);
		if (produtos != null) {
			System.out.println("Produto adicionado ao estoque.");
		} else {
			System.out.println("Estoque vazio.");
		}
		
	}
	
	public void retirarProduto(Produto p) {
		this.produtos.remove(p);
		if (produtos != null) {
			p.setQuantidade(0);
			System.out.println("Produto removido do estoque.");
		} else {
			System.out.println("Estoque vazio.");
		}
		
	}

	@Override
	public String toString() {
		return "Estoque [produtos=" + produtos + "]";
	}
	
	
}
