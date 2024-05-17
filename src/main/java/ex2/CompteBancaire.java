package ex2;

/**
 * Classe représentant un CompteBancaire
 */
public abstract class CompteBancaire {
    /** solde : solde du compte */
	protected double solde;
	
	/**
     * Constructeur pour un compte avec solde
	 * @param solde
	 */
	public CompteBancaire(double solde) {
		super();
		this.solde = solde;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Retire un montant au solde
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);
	
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
}
