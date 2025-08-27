package exercicioClasseAbstrata;

public class FuncionarioPJ extends Funcionario {
	@Override
	public double calcularSalario() {
		return this.getSalarioBase();
	}

}
