package com.jacekkaczmarek;

public class Cheetah extends Carnivorous implements Animal {
    public Cheetah(int number,int speed, int strength) {
        this.quantity=number;
        this.speed=speed;
        this.strength=strength;
    }


    @Override
    public void multiplication(int number) {
        if(number>0 && number<3)
            this.quantity+=number;
        else
            System.out.println("Invalid value, you can't do that");
    }

    @Override
    public void move() {
        System.out.println("Cheetah speed is " + this.speed);
    }

    @Override
    public void breathe() {
        System.out.println("Cheetah breathes");
    }

    @Override
    public void excretion() {
        System.out.println("Cheetah do toilet needs");
    }

    @Override
    public void specialBehaviour() {
        System.out.println("Sleeping on the tree");
    }
}
