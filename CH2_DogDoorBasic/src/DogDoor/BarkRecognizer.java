package DogDoor;

import java.util.List;

public class BarkRecognizer {
    private DogDoor dogdoor;

    public BarkRecognizer(DogDoor door){
        this.dogdoor = door;
    }

    public void recognize(Bark bark){
        List<Bark> allowedBarks = dogdoor.getAllowedBarks();
        for(Bark b: allowedBarks){
            if(b.equals(bark)){
                dogdoor.open();
                break;
            }
        }
    }
}
