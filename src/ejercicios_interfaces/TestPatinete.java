package ejercicios_interfaces;

public class TestPatinete {

	public static void main(String[] args) {

		Patinete p = new Patinete();
		p.arrancar();

		System.out.println(p.isEstaArrancado());

		p.acelerar(80);

		System.out.println(p.getVelocidadActual());

		p.freanar(35);

		System.out.println(p.getVelocidadActual());

		p.apagar();

		System.out.println(p.isEstaArrancado());

	}

}
