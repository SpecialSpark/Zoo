package exhibits;

public abstract class Exhibit {
    
    public ExhibitType exhibitType;
    public String name;

    public Exhibit(ExhibitType exhibitType, String name){
        this.exhibitType = exhibitType;
        this.name = name;
    }

    public ExhibitType getExhibitList(){
        return exhibitType;
    }

    public String getName(){
        return name;
    }
}
