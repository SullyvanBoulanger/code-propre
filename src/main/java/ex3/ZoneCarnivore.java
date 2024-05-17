package ex3;

public class ZoneCarnivore extends ZoneZoo {

	@Override
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
}