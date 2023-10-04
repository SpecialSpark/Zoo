package animals;

public class Felis extends Animal{

    public String furCoat;
    
    public Felis(String name, String species, String furCoat){
        super(name,species);
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
