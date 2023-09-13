package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Veiculo tipo = new Veiculo();
        tipo.setNome("tipo");
        tipo.setAno(2017);
        tipo.setCor("Cinza");
        tipo.setFabricante("Toyta");
        tipo.setNumRodas(4);
        
        Veiculo ferrari = new Veiculo();
        ferrari.setNome("porche");
        ferrari.setAno(2019);
        ferrari.setCor("Vermelha");
        ferrari.setFabricante("Ferrari");
        ferrari.setNumRodas(4);
        
        Veiculo bmw = new Veiculo();
        bmw.setNome("BMW");
        bmw.setAno(2020);
        bmw.setCor("Verde");
        bmw.setFabricante("BMW");
        bmw.setNumRodas(4);
        
        ArrayList<Veiculo> lista = new ArrayList<>();
        
        lista.add(ferrari);
        lista.add(bmw);
        lista.add(tipo);
        
        for (Veiculo veiculo : lista) {
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getCor());			
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getNumRodas());
		}
        
         
	}

}
