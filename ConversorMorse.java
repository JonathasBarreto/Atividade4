/*Ex:
- palavra -> morse -
    Entrada:
        "a"
    Saida:
        ".-   " Lembrar dos espaços 
        
- morse -> palavra -
    Entrada:
        ".-   "
    Saida:
        "a"
*/
        
              
        
package school.cesar.q2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.security.InvalidParameterException;

public class ConversorMorse {
	
	public static void converterTexto(String texto, String[] english, String[] morse) {
		//int a = 0;
		char c = ' ';
		String z = "";
		//String x = "";
		//int h = 0;
		for(int i = 0; i< texto.length(); i++) {
			c = texto.charAt(i);
			z = "" + c;
			for(int f = 0; f< english.length; f++) {
				if(z.equalsIgnoreCase(english[f])) {
					
					//x += english.toString();
					System.out.print(morse[f]);
				}
				
			}
		}
		
	}
	

	public static void converterCod(String texto, String[] english, String[] morse) {
		String x = "";
		for(int i = 0; i< texto.length(); i+=5){
		    x = texto.substring(i, i+5);
			//c = texto.substring(0, 4);
    		for(int f = 0; f< morse.length; f++) {
    			if(x.equals(morse[f])) {
    					
    				System.out.print(english[f]);
    				
    			}
    		}
		
		}
	}

	public static void main(String[] args)
	{
	Scanner entrada = new Scanner(System.in); 

	String[] english = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
			"p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9",
			"0",",",".","?"," " };
	
	String[] morse = { ".-   ", "-... ", "-.-. ", "-..  ", ".    ", "..-. ", "--.  ", ".... ", "..   ",
	".--- ", "-.-  ", ".-.. ", "--   ", "-.   ", "---  ", ".---.", "--.- ", ".-.  ",
	"...  ", "-    ", "..-  ", "...- ", ".--  ", "-..- ", "-.-- ", "--.. ", ".----",
	"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
	"-----", " " };
	;
	String qqString = "abcdefghijklmnopqrstuvwxyz1234567890";
	
	System.out.println("Informe a palavra em Idioma que deseja converter para morse");
	String texto = entrada.nextLine();
	char [] letras = texto.toCharArray();
	String z = "";
	for(int i = 0; i< texto.length(); i++){
	    z = "" + letras[i];
	    if(!qqString.toLowerCase ().contains(z.toLowerCase ())){
	        throw new InvalidParameterException("Palavra possui caracters invalidos");
	    }
	}

	converterTexto(texto, english, morse);

	System.out.println("Informe a palavra em morse que deseja converter para Idioma");
	String textoB = entrada.nextLine();
			
	char [] letrasB = textoB.toCharArray();
	for(int i = 0; i< textoB.length(); i++){
		if(letrasB[i]!='.' && letrasB[i]!='-' && letrasB[i]!=' '){
			throw new InvalidParameterException("Palavra possui caracters invalidos");
		}
	}
		converterCod(textoB, english, morse);
	}		
}
