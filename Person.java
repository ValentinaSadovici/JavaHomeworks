package homeworks._31_05_2023;

public class Person {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(" This person is moving.");
    }

    void talk() {
        System.out.println("This person is talking.");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "John Smith";
        person1.age = 35;
        System.out.println("The name and the age of this person are: " + person1.fullName + ", " + person1.age);

        Person person2 = new Person("Alice Taylor", 30);
        System.out.println("The name and the age of this person are: " + person2.fullName + ", " + person2.age);
    }

}

class Phone {
    private String number;
    private String model;
    private int weight;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Is calling " + name);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.number = "18787436656";
        phone1.model = "Samsung";
        phone1.weight = 250;

        Phone phone2 = new Phone("1764593467", "iPhone");
        Phone phone3 = new Phone("1567689745", "SonnyErikson", 270);
        System.out.println("The number of this phone is " + phone1.number);
        System.out.println("The model of this phone is " + phone1.model);
        System.out.println("The weight of this phone is " + phone1.weight);

        System.out.println("The characteristics of this phone are: " + phone2.number + ", " + phone2.model + ", " + phone2.weight);
        System.out.println("The characteristics of this phone are: " + phone3.number + ", " + phone3.model + ", " + phone3.weight);

        System.out.println(phone2.getNumber());
        phone2.receiveCall("Nick");
        System.out.println(phone1.getNumber());
        phone1.receiveCall("Alice");
        System.out.println(phone3.getNumber());
        phone3.receiveCall("Maria");


    }
}