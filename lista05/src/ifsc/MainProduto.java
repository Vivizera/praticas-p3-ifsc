package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto bola = new Produto();

		bola.setNome("Bola");
		bola.setCodBarras(875634l);
		bola.setPreco(4.50);
		bola.setFornecedor("Fornecedora Pedro");

		Produto faca = new Produto();

		faca.setNome("Faca");
		faca.setCodBarras(6543954l);
		faca.setPreco(3.50);
		faca.setFornecedor("Fornecedora Luisa");

		Produto anel = new Produto();

		anel.setNome("Anel");
		anel.setCodBarras(49857489l);
		anel.setPreco(199.99);
		anel.setFornecedor("Fornecedora Dani");

		ArrayList<Produto> produtos = new ArrayList<>();

		produtos.add(bola);
		produtos.add(faca);
		produtos.add(anel);
		
		System.out.println(produtos.size());
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome());
			System.out.println(produto.getCodBarras());
			System.out.println(produto.getPreco());
			System.out.println(produto.getFornecedor());
		}

	}

}
