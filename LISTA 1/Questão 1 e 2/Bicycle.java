
	public class Bicycle implements CarbonFootprint {
		
	    private boolean rodas;
	    
	    public Bicycle(boolean rodas){
	    	
	        this.rodas = rodas;
	    }
	    
	    @Override
	    public void getCarbonFootprint() {
	    	
	        System.out.println("Bicicleta não exala carbono");
	    }
	    
}
