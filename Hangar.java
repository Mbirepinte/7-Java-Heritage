public class Hangar {

public static void main(String[] args) {
    Car car = new Car("Peugeot", 200);
    Boat boat = new Boat("Titanic", 1000);
    System.out.println(car.doStuff());
    System.out.println(boat.doStuff());
}
}