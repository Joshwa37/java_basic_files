import javafx.application.*;


   

class Car extends Application {
  void start() {
        System.out.println("Car is starting...");
    }

    void stop() {
        System.out.println("Car is stopping...");
    }
}

class Maruti extends Car {
    void accelerate() {
        System.out.println("Maruti is accelerating...");
    }

    void brake() {
        System.out.println("Maruti is braking...");
    }
}

class Maruti800 extends Maruti {
    void openSunroof() {
        System.out.println("Maruti800 sunroof is open...");
    }
}

class Main {


    public static void main(String[] args) {
        Maruti800 myMaruti800 = new Maruti800();

        // Accessing methods from the Car class
        myMaruti800.start();
        myMaruti800.stop();

        // Accessing methods from the Maruti class
        myMaruti800.accelerate();
        myMaruti800.brake();

        // Accessing methods specific to Maruti800 class
        myMaruti800.openSunroof();
    }
}

