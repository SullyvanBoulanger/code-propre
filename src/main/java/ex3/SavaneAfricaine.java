package ex3;

public class SavaneAfricaine extends ZoneZoo{
	
	@Override
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
}