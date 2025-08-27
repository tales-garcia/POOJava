package aula5;

public class Principal {

	public static void main(String[] args) {
		Carro a1 = new Carro();
		a1.setMarca("Fiat");
		a1.setModelo("Pulse");
		a1.setAno(2024);
		a1.ligar();

		Moto m1 = new Moto();
		m1.ligar();
	}

}
