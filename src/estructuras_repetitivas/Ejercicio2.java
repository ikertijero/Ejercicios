package estructuras_repetitivas;

/**
 * Mostrar con bucles for anidados las tablas de multiplicar del 0 al 10
 * 
 * @author TiRii
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		// 
		
		
		for(int i=0; i <= 10; i++){
			
			for(int z=0; z <= 10; z++) {
				
				System.out.println(i + "x" + z + "=" + i*z);
				
				
			}
			System.out.println("-----------------------------");
		}

	}

}
