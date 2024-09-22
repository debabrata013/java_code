package Lab8;

class Vehicle {
    int model, year;
    String fuelType, make;
    int fuelEfficiency, distanceTraveled, maxSpeed;
 Vehicle(int m, int y, String f, String ma) {
        model = m;
        year = y;
        fuelType = f;
        make = ma;
    }  void show() {
        System.out.println("Fuel efficiency: " + fuelEfficiency + " km/l"+"\nDistance traveled: " + distanceTraveled + " km"+"\nMaximum speed: " + maxSpeed + " km/h");
       
    }
}class Truck extends Vehicle {
    Truck(int m, int y, String f, String ma) {
        super(m, y, f, ma);
        fuelEfficiency = 6; 
        distanceTraveled = 0; 
        maxSpeed = 120; 
    }
}class Car extends Vehicle {
    Car(int m, int y, String f, String ma) {
        super(m, y, f, ma);
        fuelEfficiency = 8; 
        distanceTraveled = 300; 
        maxSpeed = 220; 
    }
}class Motorcycle extends Vehicle {
    Motorcycle(int m, int y, String f, String ma) {
        super(m, y, f, ma);
        fuelEfficiency = 5; 
        distanceTraveled = 1200; 
        maxSpeed = 160; 
    }
}public class Q5 {
    public static void main(String[] args) {
        Truck v1 = new Truck(212, 2017, "Petrol", "Toyota");
        Motorcycle va = new Motorcycle(215, 2016, "Petrol", "Yamaha");
        Car vs = new Car(2157, 2017, "Petrol", "Toyota");

        v1.show();
        va.show();
        vs.show();
    }
}
