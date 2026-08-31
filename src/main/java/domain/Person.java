package domain;

public class Person {
    private String name;
    private int age;
    private String email;

    Person(){

    }
    public Person(String name, int age, String email){
        this.name=name;
        this.age=age;
        this.email=email;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getEmail(){
        return this.email;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void introduce(){
        System.out.println("This is "+name+", being "+age+" years old, with email "+email);
    }
}
