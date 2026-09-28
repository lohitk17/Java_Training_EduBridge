public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound();
        Dog d1 = (Dog) a1;
        d1.eat();
        ((Dog) a1).eat();
    }
}