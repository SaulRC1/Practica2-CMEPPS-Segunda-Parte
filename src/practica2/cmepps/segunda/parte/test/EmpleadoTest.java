package practica2.cmepps.segunda.parte.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practica2.cmepps.segunda.parte.Empleado;
import practica2.cmepps.segunda.parte.Empleado.TipoEmpleado;

class EmpleadoTest {

	private Empleado empleado = new Empleado();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaTipoEmpleadoNoValido() {
		
		boolean saltaExcepcion = false;
		
		try {
			float calculo = empleado.calculoNominaBruta(null, 0, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			saltaExcepcion = true;
		}
		
		assertTrue(saltaExcepcion);
	}
	
	@Test
	void testCalculoNominaBrutaTipoEmpleadoValido() {
		boolean noSaltaExcepcion = true;
		
		try {
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 0, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			noSaltaExcepcion = false;
		}
		
		assertTrue(noSaltaExcepcion);
	}
	
	@Test
	void testCalculoNominaBrutaVendedor1000Ventas() {
		
	}

	@Test
	void testCalculoNominaNeta() {
		
	}

}
