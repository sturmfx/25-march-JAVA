package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        List<Car> cars_list = new ArrayList<Car>();
        cars_list.add(new Car());
        cars_list.add(new Car(true));
        cars_list.add(new Car("Porche", "Grey", 480));

        for(Car c : cars_list)
        {
            c.print();
        }

        cars_list.remove(0);
        System.out.println("DELETED FIRST CAR");

        for(Car c : cars_list)
        {
            c.print();
        }

    }

    public static void part1()
    {
        Car car1 = new Car();

        Car car2 = new Car();

        car2.setType("BMW");
        car2.setLength(450);
        car2.setColor("Gold");

        car1.print();
        car2.print();
        Car.beep();
        System.out.println(Car.getNumber_of_cars());
        System.out.println(car2.getColor());
    }

    public static void part2()
    {
        Car car1 = new Car();
        Car car2 = new Car("BWM", "BLUE", 470);
        Car car3 = new Car(false);

        car1.print();
        car2.print();
        car3.print();
    }

    public static void part3()
    {
        Car[] cars = new Car[3];
        System.out.println(cars.length);
        cars[0] = new Car();
        cars[1] = new Car("Ferrari", "Red", 500);
        cars[2] = new Car(false);
        cars[0].print();
        cars[1].print();
        cars[2].print();
    }
}
