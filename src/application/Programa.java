/*Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por
linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los
ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
 */package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Funcionario;

public class Programa {
	public static void main(String[] args) {
		
		List<Funcionario> lista = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String funcionarioCsv = br.readLine();
			while (funcionarioCsv != null) {
				String[] campos = funcionarioCsv.split(",");
				lista.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
				funcionarioCsv = br.readLine();
			}
			Collections.sort(lista);
			for (Funcionario f : lista) {
				System.out.println(f.getNome() + ", " + f.getSalario());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}