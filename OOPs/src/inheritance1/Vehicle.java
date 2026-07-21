package inheritance1;

public class Vehicle {

    private String name;
    private String color;
    private String model;
    private int year;
//
//    public Vehicle(){
//        this.name=" ";
//        this.color=" ";
//        this.model= " ";
//        this.year = 10;
//    }
    public Vehicle(String name, String color, String model, int year){
        this.name = name;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void engineStarted(){
        System.out.println("Engine Started ...");
    }
    public void engineStopped(){
        System.out.println("Engine Stopped ...");
    }
}

