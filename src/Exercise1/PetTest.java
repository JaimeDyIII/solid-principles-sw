package Exercise1;

public class PetTest{
    public static void main(String[] args){
        Pet dog = new Pet("Bantay", "Bantatay");
        PetActions dogAction = new PetActions(dog);

        dogAction.makeSound("woof");
        dogAction.eat("treats");
    }
}