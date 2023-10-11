package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		ArrayList<Desktop> computadores = new ArrayList<>();

		Desktop pc = new Desktop();
		pc.setCodBarras(456789l);
		pc.setFabricante("Positivo");
		pc.setGamer(false);

		ArrayList<String> pecas = new ArrayList<>();
		pecas.add("Mouse");
		pecas.add("Teclado");
		pecas.add("Monitor");
		pecas.add("Gabinete");
		pc.setPecas(pecas);

		computadores.add(pc);

		Desktop pc2 = new Desktop();
		pc2.setCodBarras(59643l);
		pc2.setFabricante("LG");
		pc2.setGamer(false);

		ArrayList<String> pecas2 = new ArrayList<>();
		pecas2.add("Mouse");
		pecas2.add("Teclado");
		pecas2.add("Monitor");
		pecas2.add("Gabinete");
		pc2.setPecas(pecas);

		computadores.add(pc2);

		Desktop pc3 = new Desktop();
		pc3.setCodBarras(956349l);
		pc3.setFabricante("Pichau");
		pc3.setGamer(true);

		ArrayList<String> pecas3 = new ArrayList<>();
		pecas3.add("Mouse");
		pecas3.add("Teclado");
		pecas3.add("Monitor");
		pecas3.add("Gabinete");
		pc3.setPecas(pecas);

		computadores.add(pc3);

		for (Desktop desktop : computadores) {
			System.out.println(desktop.getFabricante());
			System.out.println(desktop.getCodBarras());
			System.out.println(desktop.getPecas());
		}

		Smartphone sansung = new Smartphone();
		sansung.setCodBarras(9465497L);
		sansung.setFabricante("Sansung");
		sansung.setDimensoesTela("polegadas");
		sansung.setCor("Branco");

		Smartphone apple = new Smartphone();
		apple.setCodBarras(5349576L);
		apple.setFabricante("Apple");
		apple.setDimensoesTela("polegadas");
		apple.setCor("Vermelho");

		Smartphone xiomi = new Smartphone();
		xiomi.setCodBarras(5349576L);
		xiomi.setFabricante("Apple");
		xiomi.setDimensoesTela("polegadas");
		xiomi.setCor("Vermelho");

		ArrayList<Smartphone> smartphones = new ArrayList<>();

		smartphones.add(sansung);
		smartphones.add(apple);
		smartphones.add(xiomi);

		System.out.println(smartphones.size());

		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone.getCor());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getFabricante());
			System.out.println(smartphone.getCodBarras());
		}
	}

}
