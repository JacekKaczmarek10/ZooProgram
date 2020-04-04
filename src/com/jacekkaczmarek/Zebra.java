package com.jacekkaczmarek;

public class Zebra extends Herbivorous implements Animal{

    public Zebra(int number,int speed, int strength) {
        this.quantity=number;
        this.speed=speed;
        this.strength=strength;
    }

    public void getQuantity(){
        System.out.println("Zebra quantity is: " + this.quantity);
    }

    @Override
    public void reduceQuantity(int number) {
        this.quantity-=number;
    }

    @Override
    public void multiplication(int number) {
        if(number>0 && number<6)
            this.quantity+=number;
    }

    @Override
    public void move() {
        System.out.println("Zebra speed is: " + this.speed);
    }

    @Override
    public void breathe() {
        System.out.println("Zebra breathes");
    }

    @Override
    public void excretion() {
        System.out.println("Zebra does toilet need");
    }

    @Override
    public void eatGrass() {
        System.out.println("Zebra eats grass");
    }
}
