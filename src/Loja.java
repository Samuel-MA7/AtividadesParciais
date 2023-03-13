
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

	public String mostrarEstoque() {
		return "Estoque: " + estoque;
	}
	
	public double pagar() {
		return 0;
		//método da interface Pagamento, apenas exemplo
	}
	
	public double comprar() {
		return 0;
		//método da interface Compra, apenas exemplo
	}
	

}
