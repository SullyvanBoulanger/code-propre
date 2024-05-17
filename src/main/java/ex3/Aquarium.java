package ex3;

public class Aquarium extends ZoneZoo{
	
	@Override
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.2;
	}
}