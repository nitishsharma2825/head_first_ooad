package DogDoor;

public class Remote {
    private DogDoor dogdoor;

    public Remote(DogDoor dogdoor){
        this.dogdoor = dogdoor;
    }

    public void pressButton(){
        if(dogdoor.isOpen()){
            dogdoor.close();
        } else {
            dogdoor.open();
        }
    }
}
