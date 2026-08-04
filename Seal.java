sealed class Animal permits dog,cat{
    void sound(){
        System.out.println("sound of the animal");
    }
}
final class dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
}
final class cat extends Animal{
    void meow(){
        System.out.println("cat mewo");
    }
}
public class Seal{
    public static void main(String[] args) {
        dog d=new dog();
d.sound();
d.bark();

    }
}
