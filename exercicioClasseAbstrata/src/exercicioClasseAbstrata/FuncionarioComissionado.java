package exercicioClasseAbstrata;

public class FuncionarioComissionado extends Funcionario {
	private double comissao;
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	@Override
	public double calcularSalario() {
		return this.getSalarioBase() + this.getComissao();
	}
}
