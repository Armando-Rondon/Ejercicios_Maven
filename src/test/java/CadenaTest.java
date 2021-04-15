

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void longitud() {
		String cadena="Hola";
		Clase_Cadena longi= new Clase_Cadena();
		int expected=4;

		int actual=	longi.longitud(cadena);
	
		
		assertEquals(expected,actual,"Return BIEN!");	
		}
	@Test
	void longitudFail() {
		String cadena="Hola";
		Clase_Cadena longi= new Clase_Cadena();
	

		int actual=	longi.longitud(cadena);
	
		
		assertEquals(" ",actual,"Return MAL");	
		}
	@Test
	void vocales() {
		String cadena="Hola";
		Clase_Cadena vocal= new Clase_Cadena();
		int expected=2;
		int actual=vocal.vocales(cadena);
		
		assertEquals(expected,actual,"Return BIEN!");	

	}
	@Test
	void vocalesFail() {
		String cadena="Hola";
		Clase_Cadena vocal= new Clase_Cadena();
	
		int actual=vocal.vocales(cadena);
		
		assertEquals(" ",actual,"Return Mal");	

	}
	@Test
	void invertir() {
		String cadena="Hola";
		Clase_Cadena inver= new Clase_Cadena();
		String expected="aloH";
		String actual=inver.invertir(cadena);
		
		assertEquals(expected,actual,"Return BIEN!");	

	}
	@Test
	void invertirFail() {
		String cadena="Hola";
		Clase_Cadena inver= new Clase_Cadena();
	
		String actual=inver.invertir(cadena);
		
		assertEquals(" ",actual,"Return Mal");	

	}
	@Test
	void contarLetras() {
		String cadena="Hola";
		Clase_Cadena contar= new Clase_Cadena();
		int expected=1;
		int actual=contar.contarLetra(cadena, 'H');
		
		
		assertEquals(expected,actual,"Return BIEN!" );	

		
	}
	@Test
	void contarLetrasFail() {
		String cadena="Hola";
		Clase_Cadena contar= new Clase_Cadena();
	
		int actual=contar.contarLetra(cadena, 'H');
		
		
		assertEquals(" ",actual,"Return Mal" );	

		
	}

}
