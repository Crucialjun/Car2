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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public int getNumberOfPeopleInCar() {
        return numberOfPeopleInCar;
    }

    public void setNumberOfPeopleInCar(int numberOfPeopleInCar) {
        this.numberOfPeopleInCar = numberOfPeopleInCar;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public boolean isTheCarOn() {
        return isTheCarOn;
    }

    public void setTheCarOn(boolean theCarOn) {
        isTheCarOn = theCarOn;
    }

    public char getCondition() {
        return condition;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
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

    public void upgradeMaxSpeed(){
        setMaxSpeed(getMaxSpeed() +10);
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
