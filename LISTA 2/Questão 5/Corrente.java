public class Corrente extends Conta {
    
    @Override
    public void refresh(){
    	
        this.saldo -= this.tx;
    }

    @Override
    public double saque(double valor) {
       if(this.saldo > valor){
           this.saldo -= 0.3;
           this.saldo-=valor;
           return valor;
       }
       return 0;
    }
    
}
