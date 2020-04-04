package com.jacekkaczmarek;

public abstract class Herbivorous {
    public int quantity;
    public int speed;
    public int strength;

    public abstract void eatGrass();
    public abstract void reduceQuantity(int number);
    public abstract void getQuantity();
}
