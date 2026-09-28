public class BuildingA {
    int room;
    String color;
    int floor;
    public BuildingA(int room, String color, int floor) {
        this.room = room;
        this.color = color;
        this.floor = floor;
    }
    public void print(){
        System.out.println("This is a Building Class!!");
    }
}
class BuildingB extends BuildingA {
    BuildingB(int room, String color, int floor){
        super(room, color, floor);
    }
    public void projector(){
        System.out.println("This Building is having the Projector!!");
    }
}
class Main1 {
    public static void main(String[] args) {
        BuildingA b1 = new BuildingA(100, "White", 10);
        BuildingA b2 = new BuildingA(80, "Gray", 10);
        BuildingA b3 = new BuildingA(50, "LightBlue", 10);
        BuildingB b6 = new BuildingB(100, "White", 10);


    }
}