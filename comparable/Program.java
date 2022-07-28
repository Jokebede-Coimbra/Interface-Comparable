package interfface.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		// Leitura do arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			/*
			 * Eu vou ler uma linha do arquivo, enquanto essa linha que eu li na variável
			 *name foi diferente de nulo.
			 * 
			 * Eu vou adicionar esse valor aqui na minha lista e depois eu vou ler a próxima
			 * linha. Isso aqui então vai ler o arquivo inteiro guardando cada um dos nomes
			 * e um elemento da minha lista aqui
			 */

			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			Collections.sort(list); // Uma forma de ordenar uma coleção
			for (String s : list) { // percorro a lista imprimido os elementos
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
