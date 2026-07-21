package inheritance1;

   public class Car extends Vehicle {
    String tyres;
    int windows;
    String speed;


    public Car(String name,String color, String model, int year, String tyres, int windows,String speed ){
      super(name,color,model,year);
      this.tyres = tyres;
      this.windows = windows;
      this.speed = speed;
    }
    public void acStarted(){
        System.out.println("Ac Started and speed is  "+ speed + getName());
    }
}
