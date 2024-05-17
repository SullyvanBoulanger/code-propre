package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 5));
		caisses.add(new Caisse("Moyens objets", 20));
		caisses.add(new Caisse("Grands objets", Double.MAX_VALUE));
	}

	public void addItem(Item item) {
		for(Caisse caisse : caisses){
			if(caisse.addItem(item))
				break;
		}
	}

	public int taille() {
		return caisses.stream().map(caisse -> caisse.getItems().size()).reduce(0, Integer::sum);
	}
}
