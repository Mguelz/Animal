package animal;
/*
 * herto todos os atributos do mamifero
 */
public class Cachorro extends Mamifero {

	public void enterrarOsso() {
		System.out.println("Enterrando um osso");
	}

	public void abanarRabo() {
		System.out.println("Abanando o rabo...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Au Au AU...");
	}
}
