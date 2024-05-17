package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private List<Item> items;
	private double poidsMaxSupporte;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom, double poidsMaxSupporte) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
		this.poidsMaxSupporte = poidsMaxSupporte;
	}

	public boolean addItem(Item item){
		if(item.getPoids() > poidsMaxSupporte)
			return false;
		
		items.add(item);
		return true;
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
