public class Poupança extends Conta {

    @Override
    public double saque(double valor) {
        if(this.saldo >= valor){
            this.saldo-=valor;
            return valor;
        }
        return 0;
    }

    @Override
    public void refresh() {
        this.saldo+= this.saldo*0.02;
    }
    
}
