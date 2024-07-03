public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public Person(){
}
    public Person(String name){
        this.name = name;
    }
    public void introduce(){

        System.out.println("Hello, I am: " + name + " and " + age + " years old.");
    }
}
