package school.cesar.q1;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class TresLetras {
	
	public static void Combinacao(char [] letras) {
	    for(int i = 0; i < 3; i++ ){  
	    	for( int j = 0 ; j < 3 ; j++ ){  
	    		for( int k = 0 ; k < 3 ; k++ ){ 
	    			if(i!=k && i!=j && k!=j) {
	    				System.out.println("-> " + letras[i] + letras[j] + letras[k]);
	    			}
	    		}
	    	}  
	    }
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra;
		System.out.println("Informe palavra para combinar de exatamente 5 digitos: ");
	    palavra = entrada.nextLine();
	    char[] letras = null;
	    int i;
	    char[] alfa = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
			'p','q','r','s','t','u','v','w','x','y','z'};
	    String z = "";
	    int c = 0;
	    
    	if(palavra.length() != 5) {
    		
    		throw new InvalidParameterException("Palavra possui menos de 5 digitos");    
    		/*do {
    			System.out.println(" erro ");
    			System.out.println("Informe novamente a palavra para combinar de "
    					+ "exatamente 5 digitos");
    			palavra = entrada.nextLine();
    			letras = palavra.toCharArray();
    		}while(palavra.length() != 5);*/
    		
    	}else {
    		letras = palavra.toCharArray();
    	}
    	for(i = 0; i < alfa.length; i++) {
    		for(int f = 0; f < letras.length; f++) {
		    	if(alfa[i] == letras[f]) {
		    		c++;
		    	}

	    	}
    	}
    	if(c == letras.length) {
    		Combinacao(letras);
    	}else {
    		
    		throw new InvalidParameterException("Palavra possui caracters invalidos");
    	}
	      
	}
	
}
