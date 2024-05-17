package ex3;

public class FermeReptile extends ZoneZoo {
	
	@Override
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.1;
	}
}