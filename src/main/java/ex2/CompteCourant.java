package ex2;

/** Représente un compte bancaire de type compte courant
 * @author DIGINAMIC
 */
public class CompteCourant extends CompteBancaire{
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;

	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}

	@Override
	public void debiterMontant(double montant) {
		if (solde - montant > decouvert){
			solde = solde - montant;
		}
	}

	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
