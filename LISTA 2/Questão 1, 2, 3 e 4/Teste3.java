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
			
			System.out.println("1. Adicionar um Retângulo;\r\n" + 
					"2. Adicionar um Círculo;\r\n" + 
					"3. Calcular média das áreas;\r\n" + 
					"4. Calcular média dos perímetros;\r\n" + 
					"0. Sair");
			
			opcao=sc.nextInt();

			switch (opcao) {
			case 1:

				System.out.println("Digite o valor da base do retângulo: ");

				double base = sc.nextDouble();

				System.out.println("Digite o valor da altura do retângulo: ");

				double altura = sc.nextDouble();

				Retangulo retangulo;

				retangulo = new Retangulo(base, altura);
				lista.add(retangulo);

				break;
			case 2:
				System.out.println("Digite o valor do raio do círculo: ");

				double raio = sc.nextDouble();

				Circulo circulo;

				circulo = new Circulo(raio);
				lista.add(circulo);

				break;
			case 3:
				result = calc_areas(lista);
				System.out.println("A média das áreas é: " + result);
				break;
			case 4:
				result = calc_perimetros(lista);
				System.out.println("A média dos perímetros é: " + result);
				break;

			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Escolha uma opção viável");
			}
		}

	}
}

