public class Test {
    public static void main(String[] args) {
        Jet jet = new Jet();
        jet.setSpeed(10);
        System.out.println(jet.getSpeed());
        jet.accelerate();
        System.out.println(jet.getSpeed());
    }
}
