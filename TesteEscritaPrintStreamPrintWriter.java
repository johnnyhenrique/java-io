
package br.com.alura.teste;

import java.io.IOException;
import java.io.PrintWriter;


public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

            //Fluxo de Entrada com Arquivo
//            OutputStream fos = new FileOutputStream("lorem2.txt");
//            Writer osw = new OutputStreamWriter(fos);
//            BufferedWriter bw = new BufferedWriter(osw);
    	
//    		PrintStream ps = new PrintStream(new File("lorem2.txt"));
    		PrintWriter ps =new PrintWriter("lorem2.txt");
    		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
    		ps.println();
    		ps.println();
    		ps.println();
    		ps.println("asfasdfsafdas dfs sdf asf assd�");

            ps.close();

    }
}