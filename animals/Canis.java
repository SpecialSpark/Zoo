package animals;

public class Canis extends Animal{
    public String furCoat;
    
    public Canis(String name, String furCoat){
        super(name);
        this.furCoat = furCoat;
        this.diet = Diet.CARNIVORE;
    }

    public String getFurCoat() {
        if(this.furCoat == null){
            return this.furCoat;
        } else {
            return "no coat";
        }
    }
}
