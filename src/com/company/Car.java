package com.company;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;
    int numberOfPeopleInCar = 1;

    double weight = 4079;
    double maxFuel = 16;
    double currentFuel;
    double mpg = 26.4;


    boolean isTheCarOn = false;

    char condition = 'A';

    String nameOfCar = "Lucy";

    public Car(int customMaxSpeed,double customWeight,boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void getIn(){
        numberOfPeopleInCar++;
    }

    public void getOut(){
        numberOfPeopleInCar--;
    }


    public void printVariable(){
        System.out.println("This is maxSpeed: " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }

    public void wreckCar(){
        condition = 'C';
    }

}
