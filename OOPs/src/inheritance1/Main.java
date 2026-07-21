package inheritance1;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Bike bike = new Bike("TVS Raider ", "125",
                "red", "Nylon TubeLess 4 Tyres", "60km", 2025);
        bike.engineStarted();
        bike.bikeRunning();
        bike.engineStopped();

//      Car car = new Car("Maruti", "White", "1990",2020,
//              "MRF 4 tyres", 4,"100 km/hr");
//        System.out.println(car.year);
//        System.out.println(car.name+" "+car.model);
//        System.out.println(car.color+" "+car.speed);
//        System.out.println(car.tyres+" "+car.windows);
//     car.engineStarted();
//     car.acStarted();
//     car.engineStopped();
//    }
    }
}
