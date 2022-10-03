package animal;

/*
 * herto todos os atributos do mamifero
 */
public class Canguru extends Mamifero {
	public void usarBolsa() {
		System.out.println("Usando a bolsa...");
	}

	@Override
	public void locomover() {
		System.out.println("Saltando...");
	}
}
