package headfirst.gsf.Board;

import headfirst.gsf.unit.Unit;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int height, width;
    private List<List<Tile>> tiles;

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
        initialize();
    }

    private void initialize() {
        this.tiles = new ArrayList<>();
        for(int i=0;i<width;i++){
            this.tiles.add(new ArrayList<>());
            for(int j=0;j<height;j++){
                this.tiles.get(i).add(new Tile());
            }
        }
    }

    public Tile getTile(int x,int y){
        return this.tiles.get(x).get(y);
    }

    public void addUnit(Unit unit, int x, int y){
        Tile tile = getTile(x, y);
        tile.addUnit(unit);
    }

    public void removeUnit(Unit unit, int x, int y){
        Tile tile = getTile(x, y);
        tile.removeUnit(unit);
    }

    public List<Unit> getUnits(int x, int y){
        Tile tile = getTile(x, y);
        return tile.getUnits();
    }

    public void removeUnits(int x, int y){
        Tile tile = getTile(x, y);
        tile.removeUnits();
    }

}
