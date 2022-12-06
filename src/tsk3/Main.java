package tsk3;

public class Main {
    public static void main(String[] args) {
        ZooClub zoo=new ZooClub();
        Person vasya=new Person("Vasya",2);
        zoo.addPerson(vasya);
        Pet pes=new Pet("psina",2);
        Pet kit=new Pet("kit",3);
        zoo.addPetToThePerson(vasya,pes);
        zoo.addPetToThePerson(vasya,kit);
        zoo.deleteTheSpecificAnimalFromAllPerson(pes);
        System.out.println(zoo);
    }
}
