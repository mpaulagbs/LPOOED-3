import java.util.ArrayList;
import java.util.Scanner;

public class Teste4 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> array = new ArrayList<Conta>();
        Poupança cp = null;
        Corrente cc = null;
        int numConta =0;
        
        while (true) {
            System.out.println("1. Cadastrar Conta corrente\r\n" + 
            		"2. Cadastrar Poupança\r\n" + 
            		"3. Atualizar conta corrente\r\n" + 
            		"4. Atualizar poupança\r\n" + 
            		"5. Saque conta corrente\r\n" + 
            		"6. Saque poupança\r\n" + 
            		"7. Verificar saldo de conta corrente\r\n" + 
            		"8. Verificar saldo de poupança\r\n" + 
            		"0. Sair");
            
            int op = sc.nextInt();
            switch(op){
                case 1:
                    cc = new Corrente();
                    cc.cadastrarConta();
                    array.add(cc);
                    break;
                case 2:
                    cp = new Poupança();
                    cp.cadastrarConta();
                    array.add(cp);
                    break;
                case 3:
                    System.out.println("Digite o numero da conta");
                    numConta = sc.nextInt();
                    for(int i = 0; i<array.size(); i++){
                        if(array.get(i).getNumConta() == numConta){
                        	array.get(i).refresh();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o numero da conta");
                    numConta = sc.nextInt();
                    for(int i = 0; i<array.size(); i++){
                        if(array.get(i).getNumConta() == numConta){
                        	array.get(i).refresh();
                        }
                    }
                    break;
                case 5:
                    for(int i = 0; i<array.size(); i++){
                        if(array.get(i).getNumConta() == numConta){
                            System.out.println("Digite o valor para saque");
                            double saque = sc.nextDouble();
                            if(saque<=0){
                                System.out.println("Não pode sacar um valor menor ou igual a 0");
                                break;
                            }
                            double resulCP = array.get(i).saque(saque);
                            if(resulCP == 0){
                                System.out.println("voce nao tem saldo o suficiente");
                            }
                            System.out.println("sacado "+ resulCP);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Digite o numero da conta");
                    numConta = sc.nextInt();
                    for(int i = 0; i<array.size(); i++){
                        if(array.get(i).getNumConta() == numConta){
                            System.out.println("Digite o valor para saque");
                            double saque = sc.nextDouble();
                            if(saque<=0){
                                System.out.println("Não pode sacar um valor menor ou igual a 0");
                                break;
                            }
                            double resulCP = array.get(i).saque(saque);
                            if(resulCP == 0){
                                System.out.println("voce nao tem saldo o suficiente");
                            }
                            System.out.println("sacado "+ resulCP);
                        }
                    }
                    
                    
                    break;
                case 7:
                    System.out.println("Digite o número da conta");
                    numConta = sc.nextInt();
                    for(int i = 0; i<array.size(); i++){
                        if(array.get(i).getNumConta() == numConta){
                            System.out.println(array.get(i).getSaldo());
                        }
                    }
                    break;
                case 8:
                    System.out.println("Digite o número da conta");
                    numConta = sc.nextInt();
                    for(int i = 0; i<array.size(); i++){
                        if(array.get(i).getNumConta() == numConta){
                            System.out.println(array.get(i).getSaldo());
                        }
                    }
                case 0:
                    System.exit(op);
                    break;
            }
            
        }
    }
}
