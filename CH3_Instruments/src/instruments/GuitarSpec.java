package instruments;

public class GuitarSpec extends InstrumentSpec{

    private int numString;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
        super(builder, model, type, backWood, topWood);
        this.numString = numString;
    }

    public boolean matches(InstrumentSpec otherSpec){
        if(!super.matches(otherSpec)){
            return false;
        }
        if(!(otherSpec instanceof GuitarSpec)){
            return false;
        }
        GuitarSpec spec = (GuitarSpec) otherSpec;
        if(this.numString != spec.getNumString()){
            return false;
        }
        return true;
    }
    public int getNumString() {
        return numString;
    }
}
