public class Main {
    public static void main(String[] args) {
        Car evasCar = new Car();

        evasCar.start();
        evasCar.accelerate();
        System.out.println(evasCar.speed);

        Car olgasCar = new Car();
        olgasCar.start();
        olgasCar.accelerate();
        System.out.println(olgasCar.speed);

    }
}
