package DogDoor;

public class BarkRecognizer {
    private DogDoor dogdoor;

    public BarkRecognizer(DogDoor door){
        this.dogdoor = door;
    }

    public void recognize(Bark bark){
        Bark[] allowedBarks = dogdoor.getAllowedBarks();
        for(Bark b: allowedBarks){
            if(b.equals(bark)){
                dogdoor.open();
                break;
            }
        }
    }
}
