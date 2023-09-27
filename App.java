

import animals.Canis;
import exhibits.CanisExhibit;

public class App {
    public static void main(String[] args){
        /*TODO make zoo singleton */
        
        Zoo zoo = Zoo.getInstance();

        /*TODO make CanisExhibit that extends AnimalExhibit
         *TODO make AnimalExhibit that extends Exhibit */
        CanisExhibit canisExhibit = new CanisExhibit("boxer");

        zoo.getExhibitList().add(canisExhibit);

        Canis demidog = new Canis("steve", null);

        zoo.getExhibitList().get(0).addAnimal();


        /*TODO make Canis that extends Animal*/
        //Canis hyena = new Canis();

        //canisExhibit.animalsList.addAnimal(hyena);


        
    }
}