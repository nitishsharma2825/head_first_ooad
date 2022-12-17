package ch1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        GuitarSpec spec1 = new GuitarSpec(Builder.FENDER, "Nitish", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.MAHOGANY, 12);
        inventory.addGuitar("1", 35.90, spec1);

        List<Guitar> matches = inventory.search(spec1);
        System.out.println(matches.size());
    }
}
