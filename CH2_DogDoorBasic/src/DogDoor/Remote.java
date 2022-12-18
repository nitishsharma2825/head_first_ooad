package DogDoor;

import java.util.Timer;
import java.util.TimerTask;

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
            final Timer timer = new Timer();
            timer.schedule(new TimerTask(){
                public void run(){
                    dogdoor.close();
                    timer.cancel();
                }
            }, 5000);
        }
    }
}
