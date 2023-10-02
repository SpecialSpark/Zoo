

import java.util.ArrayList;
import exhibits.Exhibit;

public class Zoo {

    public static Zoo getInstance(){
        if(zoo == null){
            zoo = new Zoo();
        }
        
        return zoo;
    }

    private static Zoo zoo;

    public ArrayList<Exhibit> exhibitList = new ArrayList<>();

    private Zoo(){
    }

    public ArrayList<Exhibit> getExhibitList(){
        return exhibitList;
    }
}
