package Zoo.exhibits;

public abstract class Exhibit {
    
    public ExhibitType exhibitType;
    public Name name;

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
