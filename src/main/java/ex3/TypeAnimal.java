package ex3;

public enum TypeAnimal {
    MAMMIFERE("Mammifère"),
    REPTILE("Reptile"),
    POISSON("Poisson"),
    SERPENT("Serpent");

    private String label;

    private TypeAnimal(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
