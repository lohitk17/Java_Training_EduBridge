public class Vehicle {
    int wheels, speed;
    public Vehicle(int wheels, int speed) {
        this.wheels = wheels;
        this.speed = speed;
    }
    void start(){
        System.out.println("The Vehicle is starting!!");
    }
}
class Car extends Vehicle{
    int doors;
    public Car(int wheels, int speed, int doors) {
        super(wheels, speed);
        this.doors = doors;
    }
    void playMusic(){
        System.out.println("Its plays Music!!");
    }
}
class Bike extends Vehicle{
    int hasGears;
    public Bike(int wheels, int speed, int hasGears) {
        super(wheels, speed);
        this.hasGears = hasGears;
    }
    void kickStart(){
        System.out.println("Bike start with the KickStart!!");
    }
}

class Truck extends Vehicle{
    int load;
    public Truck(int wheels, int speed, int load) {
        super(wheels, speed);
        this.load = load;
    }
    void unLoad(){
        System.out.println("The truck is Unloading!!");
    }
}
