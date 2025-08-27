package exercicioClasseAbstrata;

public class Principal {

	public static void main(String[] args) {
	    System.out.println("--- Testando Funcionario CLT ---");
	    FuncionarioCLT clt = new FuncionarioCLT();
	    clt.setSalarioBase(2000.00);
	    System.out.println("Salário CLT: R$ " + clt.calcularSalario() + "\n");
	
	    System.out.println("--- Testando Funcionario PJ ---");
	    FuncionarioPJ pj = new FuncionarioPJ();
	    pj.setSalarioBase(5000.00);
	    System.out.println("Salário PJ: R$ " + pj.calcularSalario() + "\n");
	
	    System.out.println("--- Testando Funcionario Comissionado ---");
	    FuncionarioComissionado comissionado = new FuncionarioComissionado();
	    comissionado.setSalarioBase(1500.00);
	    comissionado.setComissao(750.00);
	    System.out.println("Salário Comissionado: R$ " + comissionado.calcularSalario() + "\n");
	}

}
