package animals;

public abstract class Animal {
    public String name;
    public Diet diet;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Diet getDiet(){
        return this.diet;
    }
}
