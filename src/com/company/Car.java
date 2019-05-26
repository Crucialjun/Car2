package com.company;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeople = 6;

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

    public Car() {

    }

    public void getIn(){
        if(numberOfPeopleInCar < maxNumberOfPeople){
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        } else{
            System.out.println("The car is full! " + numberOfPeopleInCar + " = " + maxNumberOfPeople);
        }

    }

    public void getOut(){
        //Check if there are people in the car
        if(numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
        } else{
            System.out.println("No one is in the Car " + numberOfPeopleInCar);
        }
    }

    public double maxMilesPerFillUP(){
        return maxFuel * mpg;
    }

    public void turnTheCarOn(){
        // if the car isnt on
        if(!isTheCarOn){
            //Turn the car on
            isTheCarOn = true;
        }else{
            //Otherwise print out the error
            System.out.println("The car is already on " + isTheCarOn);
        }
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
