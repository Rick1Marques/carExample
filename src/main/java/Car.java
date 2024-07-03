public class Car {
    String brand;
    String model;
    String color;
    int yearManufactured;
    int speed;
    boolean hasStarted;

    public Car(){

    }

    public void start(){

        System.out.println("Vrum Vrum");
        hasStarted = true;
    }


    public void accelerate(){
        if (hasStarted) {
            this.speed += 5;
        } else {
            System.out.println("Please start your car first.");
        }
    }

}
