package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Gato gato = new Gato();
        gato.setNome("Nevado");
        gato.setRaca("Persa");
        gato.setComprimento(20f);
        gato.setCor("Branco");
        gato.setEcossistema("Doméstico");
        gato.setNumpatas(4);
        
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Flora");
        cachorro.setRaca("Vira-lata");
        cachorro.setComprimento(50f);
        cachorro.setCor("Preto");
        cachorro.setEcossistema("Domèstico");
        cachorro.setNumpatas(4);
        
        gato.caminha();
        gato.mia();
        
        cachorro.caminha();
        cachorro.late();
	}

}
