package Zoo;

public class App {
    public static void main(String[] args){
        /*TODO make zoo singleton */
        
        Zoo zoo = Zoo.getInstance();

        /*TODO make CanisExhibit that extends AnimalExhibit
         *TODO make AnimalExhibit that extends Exhibit */
        CanisExhibit canisExhibit = new CanisExhibit();

        zoo.getExhibitList().add(canisExhibit);


        /*TODO make Canis that extends Animal*/
        Canis hyena = new Canis();

        canisExhibit.animalsList.addAnimal(hyena);


        
    }
}