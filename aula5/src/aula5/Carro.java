package aula5;

public class Carro extends Automovel {
	private boolean temArCondicionado;

	public boolean isTemArCondicionado() {
		return temArCondicionado;
	}

	public void setTemArCondicionado(boolean temArCondicionado) {
		this.temArCondicionado = temArCondicionado;
	}
	
	public void ligar() {
		System.out.println("Carro ligado");
	}
}
