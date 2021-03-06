package lovely.Adventure.GameLevels;

import java.util.ArrayList;

import lovely.Adventure.Background.BackgroundData;
import lovely.Adventure.Teleport.LocationSave;

public class CityLevel extends DataLevel {
     CityLevel() {
        tiles = new ArrayList<String>();
        this.tiles.add("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        this.tiles.add("1......................................................................................................................1");
        this.tiles.add("1......................................................................................................................1");
        this.tiles.add("1..p..........................333333....5555....5555.....5555555...5..5...5....555555555555555555555.....g...g.........1");
        this.tiles.add("...............e............3.....................................................................55.c.c.c.c.c.c.c.....1");
        this.tiles.add("55555555555555555.......333.......................................................................5555555555555555555555");
        this.tiles.add(".....................................................................................l.................................1");
        this.tiles.add("3..............................33...........................................l.................e........................1");
        this.tiles.add("3...........................................................................................333333333333333333.........1");
        this.tiles.add("3...........................33.......................................l.............33333..........................333..1");
        this.tiles.add("3..............l............................................................333........................................1");
        this.tiles.add("3......................333..................................................................................333........1");
        this.tiles.add("3....................................................................333...............................................1");
        this.tiles.add("3...........3333333............................................l......................................333..............1");
        this.tiles.add("3..........................................................................33..........................................1");
        this.tiles.add(".......33...............l...........................l...........................................333....................1");
        this.tiles.add("3........................d...........................d......3333333333.................................................1");
        this.tiles.add(".....3....................e.......l.........l.............................................333..........................1");
        this.tiles.add("3.....................3333333......d.........d.....33333.........................................e.....................3");
        this.tiles.add("333...................3.........cccccc.......u..................................................333....................3");
        this.tiles.add("......................3.........333333.....33333......................................................333..............3");
        this.tiles.add("3...3.................3.....l................l...................l...............l....................................l3");
        this.tiles.add(".......cccccccccccccc.3...........................................................d..................g......333.....t..3");
        this.tiles.add("3.e....cccccccccccccc....c......c......c..........c.....c.......c.......c..........c..........3.c.......c.......c......3");
        this.tiles.add("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");

        backgroundDataList = new ArrayList<>();
        this.backgroundDataList.add(new BackgroundData("skyline1", -1, -7, 28, 10,15));
        locationSaves = new ArrayList<LocationSave>();
        this.locationSaves.add(new LocationSave("ForestLevel", 118f, 18f));

    }
    public static CityLevel newLevelCity(){
        return new CityLevel();
    }
}