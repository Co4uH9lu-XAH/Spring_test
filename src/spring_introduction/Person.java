package spring_introduction;

public class Person {
    private Pet pet;

    Person(Pet pet){
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hey, you!");
        pet.say();
    }
}
