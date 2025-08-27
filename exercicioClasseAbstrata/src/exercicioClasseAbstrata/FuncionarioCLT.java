package exercicioClasseAbstrata;

public class FuncionarioCLT extends Funcionario {

	@Override
	public double calcularSalario() {
		return this.getSalarioBase()/10*11;
	}

}
