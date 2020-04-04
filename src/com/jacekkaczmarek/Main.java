package com.jacekkaczmarek;

public class Main {

    static void eatAnimal(Carnivorous carnivorous,Herbivorous herbivorous){
        if(carnivorous.strength>=herbivorous.strength && carnivorous.speed>=herbivorous.speed && carnivorous.quantity>0){
            herbivorous.reduceQuantity(1);
        }
        else
            System.out.println("You can not do that");
    }

    static void joinForces(Carnivorous carnivorous,int number,Herbivorous herbivorous){
        if(carnivorous.strength*number >= herbivorous.strength && carnivorous.speed>=herbivorous.speed && herbivorous.quantity>0){
            herbivorous.reduceQuantity(1);
        }
        else
            System.out.println("You can not do that");
    }


    public static void main(String[] args) {
	Lion lions = new Lion(10,50,80);

	lions.getQuantity();

	lions.multiplication(3);

	lions.getQuantity();
	lions.breathe();
	lions.excretion();
	lions.move();

	Cheetah cheetah = new Cheetah(10,100,20);


	Zebra zebra = new Zebra(20,50,20);

	zebra.getQuantity();
	eatAnimal(lions,zebra);

	zebra.getQuantity();

	eatAnimal(cheetah,zebra);

	zebra.getQuantity();

	Antelope antelope = new Antelope(10,80,10);

	Giraffe giraffe = new Giraffe(10,40,400);

	Elephant elephant = new Elephant(10,5,800);

    eatAnimal(cheetah,elephant);


    elephant.getQuantity();

    joinForces(lions,10,elephant);

    elephant.getQuantity();


    }
}
