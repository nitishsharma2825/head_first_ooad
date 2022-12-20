package DogDoor;

public class Bark {
    private String allowedSound;

    public Bark(String sound) {
        this.allowedSound = sound;
    }

    public String getAllowedSound() {
        return allowedSound;
    }

    public boolean equals(Object bark) {
        if(bark instanceof Bark){
            Bark otherBark = (Bark) bark;
            if(otherBark.getAllowedSound().equalsIgnoreCase(this.allowedSound)){
                return true;
            }
        }
        return false;
    }
}
