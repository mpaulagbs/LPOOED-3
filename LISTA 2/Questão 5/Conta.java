import java.util.Scanner;

public abstract class Conta {

	private Scanner sc = new Scanner(System.in);
	protected int numConta;
	protected double tx = 0.2;
	protected double saldo;
	protected String cpf;
	protected String banco;

	public void cadastrarConta(){
		System.out.println("Digite o CPF");
		this.cpf = sc.next();
		System.out.println("Digite o nome do banco");
		this.banco = sc.next();
		System.out.println("Digite o saldo inicial");
		this.saldo = sc.nextDouble();
		System.out.println("Digite o número da conta");
		this.numConta = sc.nextInt();
	}

	public int getNumConta(){
		return this.numConta;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public abstract double saque(double valor);

	public abstract void refresh();

	public void verifSaldo(){
		System.out.println("Saldo: "+ this.saldo);
	}

}