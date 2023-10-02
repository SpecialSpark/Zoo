package exhibits;

import java.util.List;
import java.util.ArrayList;

import animals.Animal;

public abstract class AnimalExhibit extends Exhibit {

    private List<Animal> animalList;

    public AnimalExhibit(String name){
        super(ExhibitType.ANIMAL, name);
        this.animalList = new ArrayList<Animal>();
    }

    public List<Animal> getAnimalList(){
        return this.animalList;
    }

    public abstract void addAnimal(Animal animal);
}
