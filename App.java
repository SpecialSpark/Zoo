

import java.util.List;

import animals.Canis;
import animals.Felis;
import exhibits.CanisExhibit;
import exhibits.Exhibit;
import exhibits.FelisExhibit;

public class App {
    public static void main(String[] args){
        /*TODO make zoo singleton */
        
        Zoo zoo = Zoo.getInstance();

        /*TODO make CanisExhibit that extends AnimalExhibit
         *TODO make AnimalExhibit that extends Exhibit */
        CanisExhibit canisExhibit = new CanisExhibit("Canis Exhibit");
        FelisExhibit felisExhibit = new FelisExhibit("Felis Exhibit");

        zoo.getExhibitList().add(canisExhibit);
        zoo.getExhibitList().add(felisExhibit);

        Canis demidog = new Canis("Steve","Demidog", null);
        
        ((CanisExhibit)zoo.getExhibitList().get(0)).addAnimal(demidog);


        /*TODO make Canis that extends Animal*/
        Canis hyena = new Canis("Decroth","Hyena", "Spotted");

        ((CanisExhibit)zoo.getExhibitList().get(0)).addAnimal(hyena);

        Felis garfield = new Felis("Garfield", "House Cat", "Orange");

        ((FelisExhibit)zoo.getExhibitList().get(1)).addAnimal(garfield);

        
    }
}