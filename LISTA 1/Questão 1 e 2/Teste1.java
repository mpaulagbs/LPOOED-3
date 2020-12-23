
public class Teste1 {
	
    public static void main(String[] args) {
    	
        CarbonFootprint[] lista = { 
            new Car(50,1.6),new Car(25,2), 
            new Bicycle(false), new Bicycle(true), 
            new House(30, 20, true,false), new School(20,9, false,true)
        };
        
        
        for(int i = 0; i<lista.length; i++){
        	
            lista[i].getCarbonFootprint();
        }
    }
}