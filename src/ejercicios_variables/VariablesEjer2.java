package ejercicios_variables;

/**
 * Realizar una pequeña calculadora. Para ello se crearan 10 variables de distintos tipos numéricos. 
 * Una vez creadas dichas variables y asignadas desde código valores (se recomienda valores entre -10 y 10) realizar las siguientes operaciones:
 * <ul>
 * 	<li>La suma de todos los números</li>
 * 	<li>La resta de todos los números</li>
 * 	<li>La media de todos los números</li>
 * </ul>
 * @author iker tijero
 *
 */

public class VariablesEjer2 {

	public static void main(String[] args) {
		
		int num1=1;
		int num2=2;
		int num3=3;
		int num4=4;
		int num5=5;
		int num6=6;
		int num7=7;
		int num8=8;
		int num9=9;
		int num10=10;
		
		int suma=num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
		int resta=num1-num2-num3-num4-num5-num6-num7-num8-num9-num10;
		float media=(float)(num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10;
	
		
		System.out.println("Suma de todos los numeros:" + suma);
		System.out.println("Resta de todos los numeros:" + resta);
		System.out.println("Media de todos los numeros:" + media);
		
		
		
		

	}

}
