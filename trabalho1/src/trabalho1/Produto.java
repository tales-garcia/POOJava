package trabalho1;

public abstract class Produto {
	private String nome, categoria, codigoBarras;
	private double precoBase;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public double getPrecoBase() {
		return precoBase;
	}
	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}
	public abstract double calcularPrecoFinal();
}
