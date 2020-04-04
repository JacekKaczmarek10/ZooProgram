package com.jacekkaczmarek;

import java.awt.datatransfer.ClipboardOwner;

public class Lion extends Carnivorous implements Animal {

    public Lion(int number,int speed, int strength) {
        this.quantity=number;
        this.speed=speed;
        this.strength=strength;
    }

    @Override
    public void multiplication(int number) {
        if(number>0 && number<6)
        this.quantity+=number;
        else
            System.out.println("Invalid value, you can't do that");
    }

    public void getQuantity(){
        System.out.println("Lions quantity is: " + this.quantity);
    }

    @Override
    public void move() {
        System.out.println("Lion can move: " + this.speed);
    }

    @Override
    public void breathe() {
        System.out.println("Lion breathes");
    }

    @Override
    public void excretion() {
        System.out.println("Lion is doing his toilet need");
    }

    @Override
    public void specialBehaviour() {
        System.out.println("Control area");
    }
}
