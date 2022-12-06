package tsk1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        users.add(new User("vasya",18));
        users.add(new User("Petya",15));
        users.add(new User("Marusya",16));
        users.add(new User("Katuha",18));
        users.add(new User("Ivan",20));
        System.out.println(users);
        System.out.println("#######");
        users.sort((u1,u2)->u1.getAge()- u2.getAge());///за зростанням
        System.out.println(users);
        users.sort((u1,u2)-> u2.getAge()- u1.getAge());///за спаданням
        System.out.println(users);

        List<String> words=new ArrayList<>();
        words.add("vasya");
        words.add("andruha");
        words.add("ddddd");
        words.add("ppppp");
        words.add("petika");
        words.add("hahddsa");
        words.add("qwerty");
        words.add("abcd");
        words.add("itanarahan");
        words.add("word");
        words.add("hello");
        words.add("ldfskds");
        words.add("sssss");
        words.add("vvvvv");
        words.add("poip");
        words.add("eroe");

        System.out.println(words);
        words.sort((w1,w2)->w1.compareTo(w2));
        System.out.println(words);

    }
}
