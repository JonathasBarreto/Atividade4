package school.cesar.q4;
import java.security.InvalidParameterException;
import java.util.*;

public class ContadorDeLetras {
	
	private static Scanner entrada;

	public static void conta_ocorrencias(String caracter ,String str){   
        int count=0;  

        String C = null;
        String Z = null;
        String gg = null;

        for(int j = 0; j<caracter.length(); j++) {
        	for (int i=0; i<str.length(); i++){
        		
        		C = String.valueOf(caracter.charAt(j));
        		Z = String.valueOf(str.charAt(i));
        		
        		if(C.equalsIgnoreCase(Z)){   
        			count++;
        			
        			
        		}

        	}
        	
        	if(str.toLowerCase().contains(C)) {
        		
        		gg = C + " = " + count;
        		if(C.equals(" ")) {
        			gg = "espaço" + " = " + count;
        		}
        		
        		System.out.println(gg);
        		count = 0;	
        	}
        	
        }
              		  	
			  
    }	
	
	public static void main (String args[]){
			
		entrada = new Scanner(System.in);
			
		String palavra = "";
		
		System.out.printf("Digite uma palavra para a busca:");
		palavra = entrada.nextLine();
		String a = "abcdefghijklmnopqrstuvxyz1234567890 ";
			
		conta_ocorrencias(a,palavra);
			
		 
	}
		
}
