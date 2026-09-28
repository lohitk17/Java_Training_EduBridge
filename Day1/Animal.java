public class Animal {
    void sound(){
        System.out.println("The Animal makes the Sound!!");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("His this is Dog Constructor");
    }
    void eat(){
        System.out.println("The Dog can Eat also!!");
    }
}
class Main2 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound();
        Dog d1 = (Dog) a1;
        d1.eat();
        ((Dog) a1).eat();
    }
}
