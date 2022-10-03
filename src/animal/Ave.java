package animal;

/*
 * Extende a classe animal, gerando a classe arara
 */
public class Ave extends Animal {
	private String corPerna;

	public String getCorPerna() {
		return corPerna;
	}

	public void setCorPerna(String corPerna) {
		this.corPerna = corPerna;
	}

	public void fazerNinho() {
		System.out.println("Contruiu um ninho...");
	}

	@Override
	public void locomover() {
		System.out.println("Voando...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas...");
	}

	@Override
	public void emitirSom() {
		System.out.println("\"Emitindo som de Ave\"");
	}
}
