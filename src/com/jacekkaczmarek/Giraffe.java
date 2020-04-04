package com.jacekkaczmarek;

public class Giraffe extends Herbivorous implements Animal{

    public Giraffe(int number,int speed, int strength) {
        this.quantity=number;
        this.speed=speed;
        this.strength=strength;
    }

    @Override
    public void reduceQuantity(int number) {
        this.quantity-=number;
    }

    @Override
    public void getQuantity() {
        System.out.println("Giraffer quantity is: " + this.quantity);
    }

    @Override
    public void multiplication(int number) {
        if(number>0 && number<2)
            this.quantity+=number;
        else
            System.out.println("Giraffe can not have that number of kids");
    }

    @Override
    public void move() {
        System.out.println("Giraffe speed is:" + this.speed);
    }

    @Override
    public void breathe() {
        System.out.println("Giraffe breathes");
    }

    @Override
    public void excretion() {
        System.out.println("Giraffe do toilet need");
    }

    @Override
    public void eatGrass() {
        System.out.println("Giraffe eats grass");
    }
}