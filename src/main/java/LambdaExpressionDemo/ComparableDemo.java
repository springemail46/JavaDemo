package main.java.LambdaExpressionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Karan", 21,"Delhi"));
        personList.add(new Person("Prince", 23,"Delhi"));
        personList.add(new Person("Sonoo", 18,"Delhi"));
        personList.add(new Person("Deva", 25,"Delhi"));
        personList.add(new Person("Kiran", 29,"Delhi"));

        Collections.sort(personList);
        for(Person p : personList){
            System.out.println(p.getName()+" "+ p.getAge()+" "+p.getAddress());
        }
    }
}
