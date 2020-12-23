public class Circulo implements Objetogeometrico {

	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double area() {

		double resultFinal = Math.pow((Math.PI * raio), 2);
		return resultFinal;
	}

	public double perimetro() {

		double resultFinal = 2 * (Math.PI * raio);
		return resultFinal;
	}

}

