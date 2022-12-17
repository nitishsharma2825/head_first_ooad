package ch1;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNo, double price, GuitarSpec spec) {
        guitars.add(new Guitar(serialNo, price, spec));
    }

    public Guitar getGuitar(String serialNo) {
        for(Guitar guitar: guitars){
            if(guitar.getSerialNumber().equals(serialNo)){
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec spec){
        List<Guitar> matchingGuitars = new LinkedList<>();
        for(Guitar guitar: guitars){
            if(guitar.getSpec().matches(spec)){
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}
