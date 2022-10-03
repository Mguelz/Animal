package animal;

public class Main {

	public static void main(String[] args) {
		Mamifero mamifero = new Mamifero(); // SuperClasse de Canguru e Cachorro
		Canguru canguru = new Canguru();    // SubClasse de Mamifero
		Cachorro cachorro = new Cachorro(); // SubClasse de Mamifero
		
		Reptil reptil = new Reptil(); // SuperClasse de Tartaruga e Cobra
		Tartaruga tartaruga = new Tartaruga(); // SubClasse de Reptil
		Cobra cobra = new Cobra(); // SubClasse de Reptil
		
		Peixe peixe = new Peixe();// SuperClasse de GoldFish
		GoldFish goldFish= new GoldFish(); // SubClasse de Peixe
		
		Ave ave = new Ave();// SuperClasse de Arara
		Arara arara = new Arara(); // SubClasse de Ave
		
		ave.emitirSom();
		cobra.emitirSom();
		cachorro.emitirSom();
		mamifero.emitirSom();
		cobra.alimentar();
	}

}
