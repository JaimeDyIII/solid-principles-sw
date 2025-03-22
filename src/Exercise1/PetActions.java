package Exercise1;

public class PetActions{
    private Pet pet;

    public PetActions(Pet pet) {
        this.pet = pet;
    }

    public void makeSound(String sound){
        System.out.println(pet.getPetName() + " makes a sound, \"" + sound + "\".");
    }

    public void eat(String food){
        System.out.println(pet.getPetName() + " eats " + food + ".");
    }
}