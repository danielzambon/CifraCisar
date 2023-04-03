package main;

import java.util.Scanner;

public class cifra {
	
	public static String encript(int chave, String texto) {
	    StringBuilder textoCifrado = new StringBuilder();
	    int tamanhoTexto = texto.length();

	    for (int c = 0; c < tamanhoTexto; c++) {
	        int letraCifradaASCII = ((int) texto.charAt(c)) + chave;

	        while (letraCifradaASCII > 126) {
	            letraCifradaASCII -= 94;
	        }

	        textoCifrado.append((char) letraCifradaASCII);
	    }

	    return textoCifrado.toString();
	}

	public static String decript(int chave, String textoCifrado) {
	    StringBuilder texto = new StringBuilder();
	    int tamanhoTexto = textoCifrado.length();

	    for (int c = 0; c < tamanhoTexto; c++) {
	        int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - chave;

	        while (letraDecifradaASCII < 32) {
	            letraDecifradaASCII += 94;
	        }

	        texto.append((char) letraDecifradaASCII);
	    }

	    return texto.toString();
	}

	public static void main(String[] args) {
		System.out.println("init");
	        Scanner scaner = new Scanner(System.in);
	             
	        System.out.print("Digite [ 1 ] = Criptografar ou [ 2 ] = Descriptografar ? ");
	        String action = scaner.nextLine();
	        
	        if( Integer.parseInt(action) == 1) {
	        	
	        	System.out.print("Informe o texto á ser encriptado : ");
		        String texto = scaner.nextLine();
		        System.out.print("Saltos : ");
		        int chave = scaner.nextInt();
		        String textoCriptografado = encript(chave, texto);
		        
		        System.out.println("\rTexto cifrado : " + textoCriptografado);
	        	
	        }
	        if(Integer.parseInt(action) == 2) {
	        	
	        	System.out.print("Informe o texto á ser desencriptado : ");
		        String texto = scaner.nextLine();
		        System.out.print("Saltos usados na criptografia : ");
		        int chave = scaner.nextInt();
		       
		        String textoDescriptografado = decript(chave, texto);
		        
		        System.out.println("\rTexto Original : " + textoDescriptografado);
	        	
	        }   
	        
	        System.out.println("\r************************* FIM ************************* ");


	}


}
