package com.pluralsight;

public class Main {

    public static void main(String[] args) {



        Moped moped = new Moped("red", 2, 0, 5);


        Car car = new Car("Black", 5, 0, 10);

        SemiTruck semiTruck = new SemiTruck("White", 3, 50, 100);


        Hovercraft hovercraft = new Hovercraft("Grey", 7, 25, 50);


        System.out.println(moped);
    }
}
