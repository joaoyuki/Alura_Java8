package br.com.joaofra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Ordenando {
	
	public static void main (String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura");
		palavras.add("Editora casa do código");
		palavras.add("Caelum");
		
		System.out.println(palavras);


		Comparator<String> comparando = new ComparandoPorTamanho();
		palavras.sort(comparando);
		System.out.println(palavras);
		
		Consumer<String> exibe = new Exibindo();
		palavras.forEach(exibe);
		
	}
	
	

}

class Exibindo implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}
	
}

class ComparandoPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		if (s1.length() > s2.length()) {
			return 1;
		}
		
		if (s1.length() < s2.length()) {
			return -1;
		}		
		
		return 0;
	}
	
}
