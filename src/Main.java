
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loja loja = new Loja();
		Estoque estoque = new Estoque();
		Produto produto = new Produto();
		produto.setQuantidade(10);
		
		loja.setEstoque(estoque);
		loja.getEstoque().adicionarProduto(produto);
		loja.getEstoque().mostrarQuantEstoque(produto);
		
	}

}
