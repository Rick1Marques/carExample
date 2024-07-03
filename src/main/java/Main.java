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

        Person person1 = new Person("Olga", 40, "Female");
        System.out.println(person1.name+ " " + person1.age + " "+ person1.gender);

        Person person2 = new Person("Eva");
        System.out.println(person2.name);

        person1.introduce();
        person2.introduce();


    }

}
