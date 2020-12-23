public class Retangulo implements Objetogeometrico {
	
	private double altura;
	private double base;

	public Retangulo( double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public  double perimetro() {

		double resultFinal = ((2 * altura) + (2 * base));
		return resultFinal;

	}

	public  double area() {

		double resultFinal = altura * base;
		return resultFinal;

	}

}

