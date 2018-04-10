package practice01;

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public String introduce(){
        return "My name is "+ getName() + ". I am "+getAge()+" years old";
    }
}
