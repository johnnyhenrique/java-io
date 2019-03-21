
/**
 * Este texto se refere a documentação java
 * Stream e Reader
 * @author Jonatan
 * Stream lê bits e bytes
 * Reader char
 * Class InputStreamReader - Transforma bytes em char / Extends InputStream
 * Class BufferedReader - Representa o conjunto de char / Extends Reader
 * Classes mais genéricas: vide TesteLeitura2
 * Códigos salvos no GIT
 */

package br.com.alura.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class TesteInputStreamReader {

	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("lorem.txt"); // entrada
		Reader isr = new InputStreamReader(fis); // bits em char lista
		BufferedReader br = new BufferedReader(isr); // buffer para ler texto
		
		String linha = br.readLine(); //buffer tem metodo para ler linha
		
		while(linha != null) { // enquanto linha não nula sem conteudo
			System.out.println(linha); // le linha
			linha = br.readLine(); // linha atualiza
		}
		
		
		
		br.close(); // fecha entrada
		
	}

}
