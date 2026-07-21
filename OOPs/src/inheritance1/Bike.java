package inheritance1;

public class Bike extends Vehicle {
    String tyres;
    String speed;

         public Bike( String name, String model, String color, String tyres, String speed, int year) {
         super(name, model, color, year);
         this.tyres = tyres;
         this.speed = speed;

        }

    public void bikeRunning(){
        System.out.println("Bike is running at speed of : "+speed + getName());
    }

}

