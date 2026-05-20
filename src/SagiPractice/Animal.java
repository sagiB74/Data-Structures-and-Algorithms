package SagiPractice;

public class Animal {
    private int age;
    private String name;

    public Animal(int age , String name){
        this.age = age;
        this.name = name;
        System.out.println("animal created");
    }
//    public Animal(){}
    void Bark(){
        System.out.println("sound");
    }


}
