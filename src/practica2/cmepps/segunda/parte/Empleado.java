package practica2.cmepps.segunda.parte;

public class Empleado {
	
	public enum TipoEmpleado {
		Vendedor,
		Encargado
	};
	
	private static final int SALARIO_VENDEDOR = 2000;
	private static final int SALARIO_ENCARGADO = 2500;
	
	/**
	 * Calcula la nomina bruta del empleado
	 * 
	 * @param tipo El tipo de empleado para el que calcular la Nomina Bruta
	 * @param ventasMes Ventas realizadas en el mes por el empleado, en euros
	 * @param horasExtra Horas extra trabajadas por el empleado
	 * @return La nomina bruta del empleado
	 * @throws Exception En caso de que no se reconozca el tipo de empleado
	 */
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) throws Exception {
		
		/*
		 * El empleado puede ser Vendedor o Encargado. El salario base será 2000 euros si el empleado es de tipo 
		 * vendedor, y de 2500 euros si es de tipo encargado. Se le sumará a esta cantidad una prima de 100 euros
		 * si las ventas del mes son mayores o iguales que 1000 euros, y de 200 euros si fuese de 1500 euros o más.
		 * Por último, cada hora extra se pagará a 30 euros. 
		 * 
		 */
		
		int primaASumar = determinarPrimaASumar(ventasMes);
		
		float calculoHorasExtra = 0;
		
		if(horasExtra >= 0) {
			calculoHorasExtra = horasExtra * 30;
		}
		
		if(tipo == TipoEmpleado.Vendedor) {
			
			return SALARIO_VENDEDOR + primaASumar + calculoHorasExtra;
			
		} else if(tipo == TipoEmpleado.Encargado) {
			
			return SALARIO_ENCARGADO + primaASumar + calculoHorasExtra;
			
		} else {
			
			throw new Exception("Tipo de Empleado no reconocido");
			
		}

	}
	
	/**
	 * Calcula la nomina neta.
	 * 
	 * @param nominaBruta Nomina Bruta
	 * @return Nomina neta, en caso de que no haya retenciones, la nomina neta sera
	 * 		   igual a la bruta.
	 * @throws Exception Si la nominaBruta es menor a 0 euros
	 */
	public float calculoNominaNeta(float nominaBruta) throws Exception {
		
		/*
		 * Si la nomina bruta es menor de 2100 euros, no se aplicará ninguna retención. Para nominas superiores
		 * a 2100 pero menores de 2500 euros se les aplicará un 15%. Para salarios a partir de 2500 euros se les
		 * aplicará un 18%. El método devuelve nominaBruta * (1-retencion).
		 * 
		 */
		
		if(nominaBruta < 0) {
			throw new Exception("El valor introducido no es válido");
		}
		
		if(nominaBruta >= 2100 && nominaBruta < 2500) {
			
			return nominaBruta * (1 - 0.15f);
			
		} else if(nominaBruta >= 2500) {
			
			return nominaBruta * (1 - 0.18f);
			
		}
		
		return nominaBruta;
	}
	
	/**
	 * Determina la prima a sumar segun el numero de ventas realizadas.
	 * 
	 * @param ventasMes Ventas realizadas al mes
	 * @return La prima a sumar
	 */
	private int determinarPrimaASumar(float ventasMes) {
		
		if(ventasMes >= 1000 && ventasMes < 1500) {
			return 100;
		} else if(ventasMes >= 1500) {
			return 200;
		}
		
		return 0;
	}
}
