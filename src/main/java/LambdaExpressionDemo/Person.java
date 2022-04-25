package main.java.LambdaExpressionDemo;

public class Person implements Comparable<Person>{

    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public int compareTo(Person obj) {
        if(age == obj.age)
            return 0;
        else if(age > obj.age)
            return 1;
        else
            return -1;
    }
}
