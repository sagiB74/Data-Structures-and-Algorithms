package SagiPractice;

public class Dog extends Animal{


    public Dog(int age , String name){
        super(age , name);

        System.out.println("dog created");
    }
    void Bark(){
        System.out.println("barking");
    }
}
