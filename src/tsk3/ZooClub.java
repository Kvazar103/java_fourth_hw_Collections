package tsk3;

import java.util.*;


public class ZooClub {
    private Map<Person, List<Pet>> club=new LinkedHashMap<>();

    public void addPerson(Person person){
        club.put(person,new ArrayList<>());
    }
    public void addPetToThePerson(Person person,Pet pet){
        List<Pet> pets=club.get(person);
        pets.add(pet);
    }
    public void deletePetFromThePerson(Person person,Pet pet){
        club.get(person).removeIf(pet1 -> pet1==pet);
    }
    public void deletePersonFromTheClub(Person person){
        club.remove(person);
    }
    public void deleteTheSpecificAnimalFromAllPerson(Pet pet){
        Collection<List<Pet>> values = club.values();
        Iterator<List<Pet>> iterator = values.iterator();
        while (iterator.hasNext()) {
            List<Pet> next = iterator.next();
            next.removeIf(pet1 -> pet1.equals(pet));
        }
    }
    @Override
    public String toString() {
        return "ZooClub{" +
                "club=" + club +
                '}';
    }
}
