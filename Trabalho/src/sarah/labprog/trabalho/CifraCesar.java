package sarah.labprog.trabalho;

import java.util.Scanner;

public class CifraCesar {
	
	public String codificacao(String arq) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite n da Cifra de Cesar para codificação: ");
		int n = scan.nextInt();
		
		char c[] = arq.toCharArray();
		char[] cc;
		cc = new char[arq.length()-4]; 
		
		for(int i = 0; i<arq.length()-4; i++)
		{
			if(c[i] >= 'A' && c[i] <= 'Z')
				c[i] = (char)((c[i] - 'A' + n)%26 + 'A');
			else if(c[i] >= 'a' && c[i] <= 'z')
				c[i] = (char)((c[i] - 'a' + n)%26 + 'a');
		}
		
		for(int i = 0; i<arq.length()-4; i++) {
			cc[i] = c[i];
		}
		
		arq = new String(cc);
		return arq;

	}
	
	public String decodificacao(String arq) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite n da Cifra de Cesar para decodificação: ");
		int n = scan.nextInt();
		
		char c[] = arq.toCharArray();
		
		for(int i = 0; i<arq.length(); i++)
		{
			if(c[i] >= 'A' && c[i] <= 'Z')
				c[i] = (char)((c[i] - 'Z' - n)%26 + 'Z');
			else if(c[i] >= 'a' && c[i] <= 'z')
				c[i] = (char)((c[i] - 'z' - n)%26 + 'z');
		}
		
		arq = new String(c);
		
		return arq;
	}
}
