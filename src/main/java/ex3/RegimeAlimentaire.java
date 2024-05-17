package ex3;

public enum RegimeAlimentaire {
    CARNIVORE("Carnivore"),
    HERBIVORE("Herbivore"),
    OMNIVORE("Omnivore");

    private String label;

    private RegimeAlimentaire(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
