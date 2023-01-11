package ru.synergy.constructorTest;


public class Main {

    public static void main(String[] args) {
        Fraction fr = new Fraction(1, 2);
        fr.add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator();

        Person Oleg = new Person("Konin","Oleg",'m');
        System.out.println(Oleg);

        Employee olga = new Employee("Svetova", "Olga", 'f', "Buhgalter");
        olga.setFirstName("Olga");
        olga.setLastName("Svetova");
        olga.setGender('f');

        System.out.println(olga);
        olga.tellMeWhoAreYou();

        Person olga2 = olga;

        System.out.println(olga2);
        ((Employee)olga2).tellMeWhoAreYou();
        //Employee oleg2 = oleg;
    }
}

class Fraction {
    private int numerator; //числитель
    private int denominator; //знаменатель

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add1ToNumerator() {
        this.numerator++;
        return this;
    }

    public Fraction getObjetCurrent() {
        return this;
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected char gender; // m -male, f- female

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(){
        this("","",'-');
    }

    public  Person(String lastName){
        this(lastName,"",'-');
    }
    public  Person(String lastName, String firstName, char gender){
        this(lastName,firstName);
        this.gender = gender;
    }
    public Person(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class Employee extends Person{
    protected  String dolzhnost;

    public Employee(String lastName, String firstName, char gender, String dolzhnost) {
        super(lastName, firstName, gender);
        this.dolzhnost = dolzhnost;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dolzhnost='" + dolzhnost + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void tellMeWhoAreYou(){
        System.out.println("Hello, I'm employee, and my class is" + this.getClass());
    }
}