package Zoo.exhibits;

import java.util.ArrayList;

public abstract class AnimalExhibit extends Exhibit {

    public ArrayList<Animal> animalList;
    public AnimalExhibit(ExhibitType exhibitType, String name, ArrayList<Animal> animalList){
        super(exhibitType, name);
        this.animalList = animalList;
    }
}
