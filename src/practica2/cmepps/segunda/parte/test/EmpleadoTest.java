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
		//Limite Inferior - 1000 ventas
		//Pondremos 0 horas extras
		
		float expected = 2100;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1000, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaVendedor1499Ventas() {
		//Limite Superior - 1499 ventas
		//Pondremos 0 horas extras
		
		float expected = 2100;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1499, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaVendedor1500Ventas() {
		//Limite Inferior - 1500 ventas
		//Pondremos 0 horas extras
		
		float expected = 2200;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1500, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaVendedorMasDe1500Ventas() {
		//Limite Superior - +1500 ventas
		//Pondremos 0 horas extras
		
		float expected = 2200;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 8000, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaVendedor999Ventas() {
		//Limite Superior Tramo [0, 1000) - 999 ventas
		//Pondremos 0 horas extras
		
		float expected = 2000;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 999, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaVendedor0Ventas() {
		//Limite Inferior Tramo [0, 1000) - 0 ventas
		//Pondremos 0 horas extras
		
		float expected = 2000;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 0, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaVendedorMenosUnaVentas() {
		//Limite Superior Tramo [-infinito, 0) - -1 ventas
		//Pondremos 0 horas extras
		
		float expected = 2000;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, -1, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaVendedorMenos1000Ventas() {
		//Limite Inferior Tramo [-infinito, 0) - -1000 ventas
		//Pondremos 0 horas extras
		
		float expected = 2000;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, -1000, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaEncargado1000Ventas() {
		//Limite Superior - 1499 ventas
		//Pondremos 0 horas extras
		
		float expected = 2600;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}

	@Test
	void testCalculoNominaBrutaEncargado1499Ventas() {
		//Limite Superior - 1499 ventas
		//Pondremos 0 horas extras
		
		float expected = 2600;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1499, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaEncargado1500Ventas() {
		//Limite Inferior - 1500 ventas
		//Pondremos 0 horas extras
		
		float expected = 2700;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1500, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaEncargadoMasDe1500Ventas() {
		//Limite Superior - +1500 ventas
		//Pondremos 0 horas extras
		
		float expected = 2700;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 8000, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaEncargado999Ventas() {
		//Limite Superior Tramo [0, 1000) - 999 ventas
		//Pondremos 0 horas extras
		
		float expected = 2500;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 999, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaEncargado0Ventas() {
		//Limite Inferior Tramo [0, 1000) - 0 ventas
		//Pondremos 0 horas extras
		
		float expected = 2500;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 0, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaEncargadoMenosUnaVentas() {
		//Limite Superior Tramo [-infinito, 0) - -1 ventas
		//Pondremos 0 horas extras
		
		float expected = 2500;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, -1, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraNoValidoLimiteInferior() {
		//Limite Inferior Tramo [-infinito, 0) --> -1000
		
		float expected = 2500;
		
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 0, -1000);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraNoValidoLimiteSuperior() {
		//Limite Inferior Tramo [-infinito, 0) --> -1
		
		float expected = 2500;
		
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 0, -1);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraValidoLimiteInferior() {
		//Limite Inferior Tramo [0, +infinito] --> 0
		
		float expected = 2500;
		
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 0, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraValidoLimiteSuperior() {
		//Limite Superior Tramo [0, +infinito] --> 1000
		
		float expected = 2500 + (1000 * 30);
		
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 0, 1000);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaBrutaEncargadoMenos1000Ventas() {
		//Limite Inferior Tramo [-infinito, 0) - -1000 ventas
		//Pondremos 0 horas extras
		
		float expected = 2500;
		try {
			
			float calculo = empleado.calculoNominaBruta(TipoEmpleado.Encargado, -1000, 0);
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

			fail("testCalculoNominaBrutaVendedor1000Ventas - Tipo de Empleado no valido");
			
		}
	}
	
	@Test
	void testCalculoNominaNetaNoValidoLimiteInferior() {
		//Limite Inferior tramo [-infinito, 0) --> -1000
		try {
			empleado.calculoNominaNeta(-1000);
			
			//Si llega aqui el test ha fallado
			fail("No salta la excepcion");
			
		} catch (Exception e) {

		}
	}
	
	@Test
	void testCalculoNominaNetaNoValidoLimiteSuperior() {
		//Limite Superior tramo [-infinito, 0) --> -1
		try {
			empleado.calculoNominaNeta(-1);
			
			//Si llega aqui el test ha fallado
			fail("No salta la excepcion");
			
		} catch (Exception e) {

		}
	}
	
	@Test
	void testCalculoNominaNetaValido0() {
		//Limite Inferior Tramo [0, 2100) --> 0
		
		float expected = 0;
		
		try {
			
			float calculo = empleado.calculoNominaNeta(0);
			
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

		}
	}
	
	@Test
	void testCalculoNominaNetaValido2099() {
		//Limite Superior Tramo [0, 2100) --> 2099
		
		float expected = 2099;
		
		try {
			
			float calculo = empleado.calculoNominaNeta(2099);
			
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

		}
	}
	
	@Test
	void testCalculoNominaNetaValido2100() {
		//Limite Inferior Tramo [2100, 2500) --> 2100
		
		float expected = 2100 * (1 - 0.15f);
		
		try {
			
			float calculo = empleado.calculoNominaNeta(2100);
			
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

		}
	}
	
	@Test
	void testCalculoNominaNetaValido2499() {
		//Limite Superior Tramo [2100, 2500) --> 2499
		
		float expected = 2499 * (1 - 0.15f);
		
		try {
			
			float calculo = empleado.calculoNominaNeta(2499);
			
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

		}
	}
	
	@Test
	void testCalculoNominaNetaValido2500() {
		//Limite Inferior Tramo [2500, +infinito) --> 2500
		
		float expected = 2500 * (1 - 0.18f);
		
		try {
			
			float calculo = empleado.calculoNominaNeta(2500);
			
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

		}
	}
	
	@Test
	void testCalculoNominaNetaValidoMasInfinito() {
		//Limite Superior Tramo [2500, +infinito) --> 8000
		
		float expected = 8000 * (1 - 0.18f);
		
		try {
			
			float calculo = empleado.calculoNominaNeta(8000);
			
			assertEquals(expected, calculo);
			
		} catch (Exception e) {

		}
	}
	

}
