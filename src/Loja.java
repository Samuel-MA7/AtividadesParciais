
public class Loja {
	
	private Estoque estoque;
	
	public Loja() {
		
	}
	
	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public void mostrarEstoque() {
		System.out.println("Estoque: " + estoque);
	}
	
	public void pagar() {
		//método da interface Pagamento, apenas exemplo
	}
	
	public void comprar() {
		//método da interface Compra, apenas exemplo
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loja loja = new Loja();
		Estoque estoque = new Estoque();
		Produto produto = new Produto();
		produto.setQuantidade(15);
		
		loja.setEstoque(estoque);
		loja.getEstoque().adicionarProduto(produto);
		loja.getEstoque().mostrarQuantEstoque(produto);
		loja.mostrarEstoque();
		loja.getEstoque().retirarProduto(produto);
		loja.getEstoque().mostrarQuantEstoque(produto);
		loja.mostrarEstoque();
		
	}

}
