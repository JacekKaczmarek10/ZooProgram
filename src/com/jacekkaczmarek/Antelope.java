package com.jacekkaczmarek;

public class Antelope extends Herbivorous implements Animal{
    public Antelope(int number,int speed, int strength) {
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
        System.out.println("Antelope quantity is:" + this.quantity);
    }

    @Override
    public void multiplication(int number) {
        if(number>0 && number<5)
            this.quantity+=number;
    }

    @Override
    public void move() {
        System.out.println("Antelope speed is: " + speed);
    }

    @Override
    public void breathe() {
        System.out.println("Antelope breathes");
    }

    @Override
    public void excretion() {
        System.out.println("Antelope does toilet need");
    }

    @Override
    public void eatGrass() {
        System.out.println("Antelope eats grass");
    }
}
