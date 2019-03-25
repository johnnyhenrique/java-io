package br.com.alura.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File ("contas.csv"));
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha); // File Source
			linhaScanner.useLocale(Locale.US); // padrão americano . e ,
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String valorFormatado = String.format(Locale.US, "%s - %04d - %08d, %s: %08.2f",
					                                     tipoConta, agencia, numero, titular, saldo); // new Locale("pt","br"),
			
			
//			System.out.format(Locale.US, "%s - %04d - %08d, %s: %08.2f %n",
//                    tipoConta, agencia, numero, titular, saldo); // new Locale("pt","br"),);
			System.out.println(valorFormatado);
			
			linhaScanner.close();
			
		}
		
		scanner.close();
		
	}

}
