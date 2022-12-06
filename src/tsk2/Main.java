package tsk2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        HashSet<User> userHashSet=new HashSet<>();


        userHashSet.add(new User(1, "vasya", "pupkin", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19)),
                new Car("zhihuli",2000,70)));
        userHashSet.add(new User(2, "vasylina", "pupkin", "pupkin@mgail.com", 19,
                Gender.FEMALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19)),
                new Car("zhihuli",2000,70)));
        userHashSet.add(new User(3, "petya", "petkiv", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19)),
                new Car("zhihuli",2000,70)));
        userHashSet.add(new User(4, "ivan", "ivanov", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19)),
                new Car("zhihuli",2000,70)));
        userHashSet.add(new User(5, "petro", "petrov", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19)),
                new Car("zhihuli",2000,70)));
        userHashSet.add(new User(6, "marichka", "vtopilas", "pupkin@mgail.com", 19,
                Gender.FEMALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19)),
                new Car("zhihuli",2000,70)));
        userHashSet.add(new User(7, "Svetlana", "Sveta", "pupkin@mgail.com", 19,
                Gender.FEMALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19)),
                new Car("zhihuli",2000,70)));
        userHashSet.add(new User(8, "Ahmet", "pupkin", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19)),
                new Car("zhihuli",2000,70)));
        userHashSet.add(new User(9, "Karen", "pupkin", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19)),
                new Car("zhihuli",2000,70)));
        userHashSet.add(new User(10, "Natasha", "Par", "pupkin@mgail.com", 19,
                Gender.FEMALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19)),
                new Car("zhihuli",2000,70)));
        System.out.println(userHashSet);
        System.out.println("#####################");
        userHashSet.removeIf(user -> user.getGender()==Gender.MALE);
        System.out.println(userHashSet);

        TreeSet<User> userTreeSet=new TreeSet<>();
        userTreeSet.add(new User(1, "vasya", "pupkin", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19)),
                new Car("zhihuli",2000,70)));
        userTreeSet.add(new User(2, "vasya", "pupkin", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),new Skills("buhati",19),new Skills("js",10)),
                new Car("zhihuli",2000,70)));
        userTreeSet.add(new User(3, "vasya", "pupkin", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),
                new Skills("buhati",19),new Skills("js",10),new Skills("java",9)),
                new Car("zhihuli",2000,70)));
        userTreeSet.add(new User(4, "vasya", "pupkin", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19)),
                new Car("zhihuli",2000,70)));
        userTreeSet.add(new User(5, "vasya", "pupkin", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),
                new Skills("js",10),new Skills("java",9)),
                new Car("zhihuli",2000,70)));
        userTreeSet.add(new User(6, "vasya", "pupkin", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),
                new Skills("buhati",19),new Skills("js",10),new Skills("java",9),new Skills("buhat",19),
                new Skills("js",10),new Skills("java",9)),
                new Car("zhihuli",2000,70)));
        userTreeSet.add(new User(7, "vasya", "pupkin", "pupkin@mgail.com", 19,
                Gender.MALE, Arrays.asList(new Skills("buhat",19),
                new Skills("js",10),new Skills("java",9)),
                new Car("zhihuli",2000,70)));
        System.out.println("#####################");
        System.out.println(userTreeSet);


    }
}
