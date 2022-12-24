package DogDoor;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private List<Bark> allowedBarks;

    public DogDoor() {
        this.open = false;
        allowedBarks = new ArrayList<>();
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
    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }
    public void addAllowedBark(Bark bark){
        this.allowedBarks.add(bark);
    }
}
