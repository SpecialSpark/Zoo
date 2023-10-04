package animals;

public abstract class Animal {
    public String name;
    public String species;
    public Diet diet;

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String getName(){
        return this.name;
    }

    public String getSpecies(){
        return this.species;
    }

    public Diet getDiet(){
        return this.diet;
    }
}
