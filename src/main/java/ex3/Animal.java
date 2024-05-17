package ex3;

public class Animal {
    private String nom;
    private TypeAnimal type;
    private RegimeAlimentaire regimeAlimentaire;

    public Animal(String nom, TypeAnimal typeAnimal, RegimeAlimentaire regimeAlimentaire) {
        this.nom = nom;
        this.type = typeAnimal;
        this.regimeAlimentaire = regimeAlimentaire;
    }

    public String getNom() {
        return nom;
    }

    public RegimeAlimentaire getRegimeAlimentaire() {
        return regimeAlimentaire;
    }

    public TypeAnimal getType() {
        return type;
    }
}
