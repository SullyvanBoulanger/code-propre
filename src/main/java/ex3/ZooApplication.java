package ex3;

import static ex3.TypeAnimal.*;
import static ex3.RegimeAlimentaire.*;

public class ZooApplication {

	public static void main(String[] args) {
		Animal gazelle = new Animal("Gazelle", MAMMIFERE, HERBIVORE);
		Animal zebre = new Animal("Zèbre", MAMMIFERE, HERBIVORE);
		Animal lion = new Animal("Lion", MAMMIFERE, HERBIVORE);
		Animal panthere = new Animal("Panthère", MAMMIFERE, CARNIVORE);
		Animal requinBlanc = new Animal("Requin Blanc", POISSON, HERBIVORE);
		Animal truiteDoree = new Animal("Truite Dorée", POISSON, HERBIVORE);
		Animal boaConstrictor = new Animal("Boa Constrictor", SERPENT, CARNIVORE);
		Animal python = new Animal("Python", SERPENT, CARNIVORE);

		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(gazelle);
		zoo.addAnimal(zebre);
		zoo.addAnimal(lion);
		zoo.addAnimal(panthere);
		zoo.addAnimal(requinBlanc);
		zoo.addAnimal(truiteDoree);
		zoo.addAnimal(boaConstrictor);
		zoo.addAnimal(python);
	}

}