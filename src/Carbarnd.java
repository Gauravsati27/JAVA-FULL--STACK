import java.util.Scanner;
public class Carbarnd {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Driver d1=new Driver("Jhon",30);

    car c1=new car("Nexon",2026,"Pertol",d1);
    System.out.println("first car object"+c1);
    car c2=new car("BMW",2026,"Pertol",d1);
    System.out.println("first car object"+c2);
    }
}
class Driver{
    private  String name;
    private int age;

    public Driver(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return String.format("Driver name: %s,age: %d",name,age);
    }
}
class car{
    private String carName;
    private int model;
    private String engineType;
    private Driver driver;
    public car(String carName,int model,String engineType,Driver driver){
        this.carName=carName;
        this.model=model;
        this.engineType=engineType;
        this.driver=driver;
    }
    public car(car Car)
    {
        this.carName=Car.carName;
        this.model=Car.model;
        this.engineType=Car.engineType;
        this.driver=Car.driver;
    }
    public String toString(){
        return String.format("Car[name: %s, model: %d, engineType: %s, driver: %s]",carName,model,engineType,driver);
    }
        }