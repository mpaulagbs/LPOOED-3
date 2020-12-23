import java.util.ArrayList;
import java.util.Scanner;

public class Teste3 {
	
	public static double calc_areas(ArrayList<Objetogeometrico> lista) {
		double resultFinal = 0;

		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i) instanceof Retangulo) {
				resultFinal = resultFinal + lista.get(i).area();
			}

			else {
				resultFinal = resultFinal + lista.get(i).area();
			}

		}
		return resultFinal / lista.size();

	}

	public static double calc_perimetros(ArrayList<Objetogeometrico> lista) {
		double resultFinal = 0;

		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i) instanceof Retangulo) {
				resultFinal = resultFinal + lista.get(i).perimetro();
			}

			else {
				resultFinal = resultFinal + lista.get(i).perimetro();
			}

		}
		return resultFinal / lista.size();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Objetogeometrico> lista = new ArrayList<Objetogeometrico>();
		int offkey = 99, opcao = 99;
		double result;
		
		while (offkey != 0) {
			
			System.out.println("1. Adicionar um Ret�ngulo;\r\n" + 
					"2. Adicionar um C�rculo;\r\n" + 
					"3. Calcular m�dia das �reas;\r\n" + 
					"4. Calcular m�dia dos per�metros;\r\n" + 
					"0. Sair");
			
			opcao=sc.nextInt();

			switch (opcao) {
			case 1:

				System.out.println("Digite o valor da base do ret�ngulo: ");

				double base = sc.nextDouble();

				System.out.println("Digite o valor da altura do ret�ngulo: ");

				double altura = sc.nextDouble();

				Retangulo retangulo;

				retangulo = new Retangulo(base, altura);
				lista.add(retangulo);

				break;
			case 2:
				System.out.println("Digite o valor do raio do c�rculo: ");

				double raio = sc.nextDouble();

				Circulo circulo;

				circulo = new Circulo(raio);
				lista.add(circulo);

				break;
			case 3:
				result = calc_areas(lista);
				System.out.println("A m�dia das �reas �: " + result);
				break;
			case 4:
				result = calc_perimetros(lista);
				System.out.println("A m�dia dos per�metros �: " + result);
				break;

			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Escolha uma op��o vi�vel");
			}
		}

	}
}

