package headfirst.gsf.unit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class UnitGroup {
    private Map units;

    public UnitGroup(List unitList) {
        units = new HashMap();
        for(Iterator i = unitList.iterator(); i.hasNext(); ){
            Unit unit = (Unit) i.next();
            units.put(unit.getId(), unit);
        }
    }

    public void addUnit(Unit unit) {
        units.put(unit.getId(), unit);
    }

    public void removeUnit(Unit unit) {
        units.remove(unit.getId());
    }

    public Unit getUnit(int id){
        return (Unit)units.get(id);
    }

}
