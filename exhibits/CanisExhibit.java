package exhibits;

import animals.Animal;
import animals.Canis;

public class CanisExhibit extends AnimalExhibit{
    public CanisExhibit(String name){
        super(name);
    }

    @Override
    public void addAnimal(Animal animal) {
        // TODO Auto-generated method stub
        if(animal instanceof Canis){
            getAnimalList().add(animal);
            System.out.println(animal.name + " is happy in ");
        } else{
            
        }
    }
    
}
