package sarah.labprog.trabalho;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeituraEscrita {

	public String leitor(String path) throws IOException {
		
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        String arq = new String();
        while (true) {
            if (linha == null)
                break;
            linha = buffRead.readLine();
            arq += linha;
        }
        buffRead.close();
        
        String arq1 = new String();
        return arq;
    }
	
 
    public void escritor(String path, String arq) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        buffWrite.append(arq);
        buffWrite.close();
    }

}