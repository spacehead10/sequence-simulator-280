package components.nucleotide;

public class Nucleotide {
    private final Base base;

    public Nucleotide(String baseLetter) throws IllegalArgumentException {
        baseLetter = baseLetter.toUpperCase();
        base = Base.valueOf(baseLetter);
    }

    public String getComplement() {
        return switch (base) {
            case A -> "T";
            case T -> "A";
            case G -> "C";
            case C -> "G";
        };
    }

    public enum Base {
        A, T, G, C
    }
}
