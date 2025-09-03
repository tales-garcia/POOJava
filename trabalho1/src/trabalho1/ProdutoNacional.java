package trabalho1;

public class ProdutoNacional extends Produto {
	private String fabricante;

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public double calcularPrecoFinal() {
		return this.getPrecoBase();
	}

}
