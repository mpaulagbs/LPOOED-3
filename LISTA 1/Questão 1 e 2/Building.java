import java.util.Random;

	public abstract class Building implements CarbonFootprint {
		
	    private int numPessoas;
	    private int lamps;
	    private boolean enerRenov;
	    private boolean arCond;

	    public Building(int numPessoas, int lamps, boolean enerRenov, boolean arCond) {
	    	
	        this.numPessoas = numPessoas;
	        this.lamps = lamps;
	        this.enerRenov = enerRenov;
	        this.arCond = arCond;
	    }
	    
	    
	    @Override
	    public void getCarbonFootprint() {
	    	
	        Random aleato = new Random();
	        
	        System.out.println((aleato.nextInt(20)+1)+" de CO2 por dia");
	    }
	    
}
