package trabalho1;

public class ProdutoPerecivel extends Produto {
	private String dataValidade;

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public double calcularPrecoFinal() {
		return this.getPrecoBase()*0.8;
	}

}
