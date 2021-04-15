

public class Clase_Cadena {

	
	public int longitud(String cadena) {
		int longi=0;
		longi=cadena.length();
		
		return longi;
		
	}
	
	public int vocales(String cadena) {
		
		int vocales=0;
		for(int x=0;x<cadena.length();x++) {
			 if ((cadena.charAt(x)=='a') || (cadena.charAt(x)=='e') || (cadena.charAt(x)=='i') || (cadena.charAt(x)=='o') || (cadena.charAt(x)=='u')){ 
			    
				 vocales++;
			  }
			 
			}
		return vocales;
	}
	public String invertir(String cadena) {
		String palabraInvertido="";
		
		for (int x=cadena.length()-1;x>=0;x--) {
			  palabraInvertido = palabraInvertido + cadena.charAt(x);
		}
		return palabraInvertido;
	}
	
	public int contarLetra(String cadena, char caracter) {
		int contar=0;
		for (int i = 0; i < cadena.length(); i++) {
			 	if (cadena.charAt(i)==caracter) {
			 		contar++;
					
				}
		}
		return contar;
	}
	
	
}
