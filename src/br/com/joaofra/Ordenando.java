package br.com.joaofra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Ordenando {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura");
		palavras.add("Editora casa do código");
		palavras.add("Caelum");

		System.out.println(palavras);

		// Como o método sort recebe um comparator, podemos implementar a classe dentro
		// do sort mesmo
		palavras.sort(new Comparator<String>() {

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
		});

		// Passando para lambda
		palavras.sort((String s1, String s2) -> {
			if (s1.length() > s2.length()) {
				return 1;
			}

			if (s1.length() < s2.length()) {
				return -1;
			}

			return 0;
		});

		System.out.println(palavras);

		// Criamos uma classe interna para diminuir o tanto de código
		Consumer<String> exibe = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		};

		palavras.forEach(exibe);

		// Podemos usar diretamente no forEach também
		palavras.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		});

		// Já que o forEach recebe um Consume, e a interface Consumer só ter o metodo
		// accept, pode fazer assim
		// Podemos usar diretamente no forEach também
		palavras.forEach((String t) -> {
			System.out.println(t);
		});
		
		palavras.forEach(t -> System.out.println(t));		

	}

}