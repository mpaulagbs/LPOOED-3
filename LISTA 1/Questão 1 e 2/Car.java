import java.util.Random;

	public class Car implements CarbonFootprint {
		
		 private double cilind;
	    private double combus;
	    
	    public Car( double cilind, double combus){
	        this.cilind = cilind;
	        this.combus = combus;
	    }
	    
	    @Override
	    public void getCarbonFootprint() {
	   
	        Random aleato = new Random();
	        
	        System.out.println((aleato.nextInt(50)+1)+" de CO2 por semana");
	    }
	}

