package instruments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> instruments;

    public Inventory() {
        instruments = new LinkedList<>();
    }

    public void addInstrument(String serialNo, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNo, price, (GuitarSpec) spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNo, price, (MandolinSpec) spec);
        }
        instruments.add(instrument);
    }

    public Instrument getInstrument(String serialNo) {
        for(Instrument instrument: instruments){
            if(instrument.getSerialNumber().equals(serialNo)){
                return instrument;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec spec){
        List<Guitar> matchingGuitars = new LinkedList<>();
        for(Iterator i = instruments.iterator(); i.hasNext(); ){
            Guitar guitar = (Guitar) i.next();
            if(guitar.getSpec().matches(spec)){
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

    public List<Mandolin> search(MandolinSpec spec){
        List<Mandolin> matchingMandolins = new LinkedList<>();
        for(Iterator i = instruments.iterator(); i.hasNext(); ){
            Mandolin mandolin = (Mandolin) i.next();
            if(mandolin.getSpec().matches(spec)){
                matchingMandolins.add(mandolin);
            }
        }
        return matchingMandolins;
    }
}
