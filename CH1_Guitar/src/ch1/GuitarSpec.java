package ch1;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numString;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numString = numString;
    }

    public boolean matches(GuitarSpec otherSpec){
        if(this.builder != otherSpec.builder || this.type != otherSpec.type || this.topWood != otherSpec.topWood
        || this.backWood != otherSpec.backWood || this.numString != otherSpec.numString || this.model!= otherSpec.model){
            return false;
        }
        return true;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumString() {
        return numString;
    }
}
