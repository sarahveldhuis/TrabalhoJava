package sarah.labprog.trabalho;

import java.util.Scanner;
import java.io.IOException;

public class CodDec {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do arquivo a ser codificado(exemplo: original.txt): ");
		String nome = scan.next();
		
		
		
		LeituraEscrita le = new LeituraEscrita();
		
		CifraCesar cc = new CifraCesar();
		
		Huffman huf = new Huffman();
		
		le.escritor("criptografia.txt", huf.encode(cc.codificacao(le.leitor(nome))));
		
		le.escritor("decriptografia.txt", cc.decodificacao(huf.decode(le.leitor("criptografia.txt"))));
		
		System.out.println("\n\nSua criptografia e decriptografia foram realizadas com sucesso!\nOs arquivos de criptografia e decriptografia foram gerados.");
		
	}
	


}
