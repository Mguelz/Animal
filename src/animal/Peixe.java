package animal;

/*
 * Extende a classe animal, gerando a classe goldFish
 */
public class Peixe extends Animal {
	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	public void soltarBolha() {
		System.out.println("Soltou 4 bolhas...");
	}

	@Override
	public void locomover() {
		System.out.println("Nadando...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Substancias...");
	}

	@Override
	public void emitirSom() {
		System.out.println("\"Peixe não faz som\"");
	}

}
