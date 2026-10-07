package components;

import components.nucleotide.Nucleotide;

import java.util.List;
import java.util.ArrayList;

public class Strand {
    private List<Nucleotide> nucleotides;

    public Strand() {
        nucleotides = new ArrayList<>();
    }

    public Strand(String nucleotideString) {
        this();
        try {
            for (int i = 0; i < nucleotideString.length(); i++) {
                nucleotides.add(new Nucleotide(nucleotideString.substring(i, i + 1)));
            }
        }
        catch (IllegalArgumentException iae) {
            System.err.println(nucleotideString + " is not a valid nucleotide string");
            iae.printStackTrace();
            nucleotides.clear();
        }
    }
}
