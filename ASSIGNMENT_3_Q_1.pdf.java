import java.awt.*;
import java.util.Scanner;

abstract class Vehicle{
    abstract void details();
}
class trucks extends Vehicle{
    int vehicalnumber;
    String model;
    int builtyear;
    String capacity;
    int average = 10;
    trucks(int vehicalnumber,String model, int builtyear, String capacity){
        this.vehicalnumber=vehicalnumber;
        this.model=model;
        this.builtyear=builtyear;
        this.capacity=capacity;
    }

    @Override
    void details() {
        System.out.println("--------------Details------------- ");
        System.out.println("Vehical Number: " + this.vehicalnumber);
        System.out.println("Model: " + this.model);
        System.out.println("Built Year: " + this.builtyear);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Per liter Fuel Average: " + average);


    }


}
class Vans extends Vehicle{
    int vehicalnumber;
    String model;
    int builtyear;
    String capacity;
    int average = 15;
    Vans(int vehicalnumber,String model, int builtyear, String capacity){
        this.vehicalnumber=vehicalnumber;
        this.model=model;
        this.builtyear=builtyear;
        this.capacity=capacity;
    }

    @Override
    void details() {
        System.out.println("--------------Details------------- ");
        System.out.println("Vehical Number: " + this.vehicalnumber);
        System.out.println("Model: " + this.model);
        System.out.println("Built Year: " + this.builtyear);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Per liter Fuel Average: " + average);
    }


}
class motercycles extends Vehicle{
    int vehicalnumber;
    String model;
    int builtyear;
    String capacity;
    int average = 45;
    motercycles(int vehicalnumber,String model, int builtyear, String capacity){
        this.vehicalnumber=vehicalnumber;
        this.model=model;
        this.builtyear=builtyear;
        this.capacity=capacity;
    }


    @Override
    void details() {
        System.out.println("--------------Details------------- ");
        System.out.println("Vehical Number: " + this.vehicalnumber);
        System.out.println("Model: " + this.model);
        System.out.println("Built Year: " + this.builtyear);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Per liter Fuel Average: " + average);


    }


}



public class Assigment3Qno1 {
    public static void main(String[] args) {
        trucks obj = new trucks(2534, "truck", 2001, "120 kg");
        Vans obj2 = new Vans(1234, "van", 2012, "100 kg");
        motercycles obj3 = new motercycles(456, "Bike", 2021, "2 seats");
        Scanner scanner = new Scanner(System.in);
        int Choice;
        do {
            System.out.println("------------WELCOME TO TRANSPORTATION MANAGEMENT SYSTEM--------------  ");
            System.out.println("1: Truck  ");
            System.out.println("2: Van ");
            System.out.println("3: Motorcycle ");
            System.out.println("4: Exit ");
            System.out.println("Enter your choice: ");
            Choice = scanner.nextInt();
            switch (Choice) {
                case 1:
                    obj.details();
                    break;
                case 2:
                    obj2.details();
                    break;
                case 3:
                    obj3.details();
                    break;
                case 4:
                    System.out.println("-----------Exiting----------");
                    break;
                default:
                    System.out.println("Invaid choice ");
            }
        } while (Choice != 4);
        scanner.close();
    }
}
