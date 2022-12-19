package DogDoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        this.open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            public void run(){
                close();
                timer.cancel();
            }
        }, 5000);
    }
    public void close() {
        this.open = false;
    }
    public boolean isOpen() {
        return this.open;
    }
}
