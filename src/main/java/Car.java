public class Car {
    String brand;
    String model;
    String color;
    int yearManufactured;
    int speed;

    public Car(){

    }

    public void start(){
        System.out.println("Vrum Vrum");
    }


    public void accelerate(){
        this.speed += 5;

    }

}
