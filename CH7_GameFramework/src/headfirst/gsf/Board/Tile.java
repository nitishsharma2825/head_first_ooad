package headfirst.gsf.Board;

import headfirst.gsf.unit.Unit;

import java.util.ArrayList;
import java.util.List;

public class Tile {
    private List<Unit> units;

    public Tile() {
        this.units = new ArrayList<>();
    }

    // can only be accessed inside the headfirst.gsf.Board package
    protected void addUnit(Unit unit){
        this.units.add(unit);
    }

    protected void removeUnit(Unit unit){
        this.units.remove(unit);
    }

    public List<Unit> getUnits(){
        return this.units;
    }

    public void removeUnits(){
        this.units.removeAll(this.units);
    }
}
