

import java.util.ArrayList;
import java.util.List;
import exhibits.Exhibit;

public class Zoo {

    public static Zoo getInstance(){
        if(zoo == null){
            zoo = new Zoo();
        }
        
        return zoo;
    }

    private static Zoo zoo;

    public List<Exhibit> exhibitList = new ArrayList<>();

    private Zoo(){
    }

    public List<Exhibit> getExhibitList(){
        return exhibitList;
    }
}
