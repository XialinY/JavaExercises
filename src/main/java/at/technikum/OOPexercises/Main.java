package at.technikum.OOPexercises;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //1.Person exercise
        Person one = new Person("YoMama", 64);
        Person two = new Person("Santa Claus", 2);

        System.out.printf("%s, %2d\n", one.getName(), one.getAge());
        System.out.printf("%s, %2d\n", two.getName(), two.getAge());

        //2.Dog exercise
        Dog chris = new Dog("Chris", "Labrador");
        Dog dom = new Dog("Dom", "German Shepherd");

        dom.setDogBreed("yo mai");
        chris.setDogBreed("seggsy dog");

        System.out.printf("%s, %s\n", chris.getDogName(), chris.getDogBreed());
        System.out.printf("%s, %s\n", dom.getDogName(), dom.getDogBreed());

        //3.Rectangle exercise
        Rectangle blub = new Rectangle(5,1);
        System.out.printf("Area: %.2f\n", blub.calcArea());
        System.out.printf("Circumference: %.2f\n", blub.calcCircumference());

        //4.Circle exercise
        Circle chrisHead = new Circle(20);
        chrisHead.setRadius(6.5);
        System.out.printf("Area: %.2f\n", chrisHead.calcArea());
        System.out.printf("Circumference: %.2f\n", chrisHead.calcCircumference());

        //5.Book exercise


        //6.Employee
        Employee employee1 = new Employee("Max", "HR", 40000);
        Employee employee2 = new Employee("Olaf", "Project Management", 60000);
        employee1.salaryCalc(10);
        System.out.println(employee1);
        System.out.println(employee2);

        //TODO 7.Bank


        //8.TrafficLight
        TrafficLight light1 = new TrafficLight("green", 45);
        System.out.println("light is red: " + light1.isRed());
        System.out.println("light is green: " + light1.isGreen());
        System.out.println("time left: " + light1.getDuration());
        light1.setDuration(20);
        light1.changeColor("red");
        System.out.println("light is red: " + light1.isRed());
        System.out.println("light is green: " + light1.isGreen());
        System.out.println("time left: " + light1.getDuration());


        //9.Employee Hire Date
        EmployeeHireDate emploOne = new EmployeeHireDate("Yo Mama", 2, 1042021);
        System.out.println("Years of Service: " + emploOne.yearsHired(4022023));

        //TODO 10.Student

        //TODO 11.Library

        //12.Airplane
        Airplane boeing = new Airplane("OS182", LocalTime.of(13,45), "Yo house");
        boeing.setDelay(90);
        boeing.updatedDeparture(boeing);

        //TODO 13.Inventory

        //TODO 14.School

        //TODO 15.MusicLibrary

        //TODO 16.Shape

        //TODO 17.Movie

        //TODO 18.Restaurant

        //TODO 19.booking.com template


    }
}
