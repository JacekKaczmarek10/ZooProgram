package com.jacekkaczmarek;

public class Elephant extends Herbivorous implements Animal {
    public Elephant(int number,int speed, int strength) {
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
        System.out.println("Elephant quantity is:" + this.quantity);
    }

    @Override
    public void multiplication(int number) {
        if(number>0 && number<2)
            this.quantity+=number;
        else
            System.out.println("Elephant can't have so many kids");
    }

    @Override
    public void move() {
        System.out.println("Elephant speed is: " + this.speed);
    }

    @Override
    public void breathe() {
        System.out.println("Elephant breathes");
    }

    @Override
    public void excretion() {
        System.out.println("Elephant do its need");
    }

    @Override
    public void eatGrass() {
        System.out.println("Elephant eats grass");
    }
}
