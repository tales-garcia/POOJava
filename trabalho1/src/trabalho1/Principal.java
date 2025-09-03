package trabalho1;

public class Principal {

	public static void main(String[] args) {
		ProdutoNacional nacional = new ProdutoNacional();
        nacional.setNome("Caderno");
        nacional.setPrecoBase(20.00);
        nacional.setFabricante("Tilibra");
        System.out.println("Produto Nacional: " + nacional.getNome());
        System.out.println("Fabricante: " + nacional.getFabricante());
        System.out.println("Preço Final: R$ " + String.format("%.2f", nacional.calcularPrecoFinal()));

        ProdutoImportado importado = new ProdutoImportado();
        importado.setNome("Smartphone");
        importado.setPrecoBase(1000.00);
        importado.setPaisOrigem("China");
        System.out.println("Produto Importado: " + importado.getNome());
        System.out.println("País de Origem: " + importado.getPaisOrigem());
        System.out.println("Preço Final: R$ " + String.format("%.2f", importado.calcularPrecoFinal()));

        ProdutoPerecivel perecivel = new ProdutoPerecivel();
        perecivel.setNome("Iogurte");
        perecivel.setPrecoBase(5.00);
        perecivel.setDataValidade("10/09/2025");
        System.out.println("Produto Perecivel: " + perecivel.getNome());
        System.out.println("Data de Validade: " + perecivel.getDataValidade());
        System.out.println("Preço Final: R$ " + String.format("%.2f", perecivel.calcularPrecoFinal()));
	}

}
