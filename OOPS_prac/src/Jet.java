public class Jet extends Aeroplane{
    public static final int MULTI = 2;

    public Jet() {
        super();
    }
    public void setSpeed(int speed){
        super.setSpeed(speed * MULTI);
    }
    public void accelerate(){
        super.setSpeed(getSpeed() * 2);
    }
}
