package DogDoor;

public class BarkRecognizer {
    private DogDoor dogdoor;

    public BarkRecognizer(DogDoor door){
        this.dogdoor = door;
    }

    public void recognize(){
        dogdoor.open();
    }
}
