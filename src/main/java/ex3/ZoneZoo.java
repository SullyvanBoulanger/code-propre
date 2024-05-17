package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class ZoneZoo {
	protected List<Animal> animaux = new ArrayList<>();

	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
        List<String> nomsAnimaux = animaux.stream().map(Animal::getNom).toList();
		for (String nom: nomsAnimaux){
			System.out.println(nom);
		}
	}

    public int compterAnimaux(){
		return animaux.size();
	}
	
	public abstract double calculerKgsNourritureParJour();
}
