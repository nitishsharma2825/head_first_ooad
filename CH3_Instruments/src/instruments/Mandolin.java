package instruments;

public class Mandolin extends Instrument{
    private String serialNumber;
    private double price;

    // encapsulation
    private MandolinSpec spec;

    public Mandolin(String serialNumber, double price, MandolinSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public MandolinSpec getSpec() {
        return spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
