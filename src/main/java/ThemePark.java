import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractionsList;
    private ArrayList<Stall> stallList;


    public ThemePark(ArrayList<Attraction> attractionsList, ArrayList<Stall> stallList) {
        this.attractionsList = attractionsList;
        this.stallList = stallList;
    }

    public ArrayList<Attraction> getAttractionsList() {
        return attractionsList;
    }

    public ArrayList<Stall> getStallList() {
        return stallList;
    }
}
