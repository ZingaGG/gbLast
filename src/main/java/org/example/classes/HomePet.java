package org.example.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class HomePet {
    protected String name;
    protected String action;
    protected ArrayList<String> actionsForDog;
    protected ArrayList<String> actionsForCat;
    protected ArrayList<String> actionsForHamster;

    {
        actionsForDog = new ArrayList<>();
        actionsForDog.add("Run".toLowerCase());
        actionsForDog.add("Jump".toLowerCase());

        actionsForCat = new ArrayList<>();
        actionsForCat.add("Meow".toLowerCase());
        actionsForCat.add("Sleep".toLowerCase());

        actionsForHamster = new ArrayList<>();
        actionsForHamster.add("Wheel".toLowerCase());
        actionsForHamster.add("Eat".toLowerCase());
    }
    public HomePet(String name, String action){
        this.name = name;
        this.action = action.toLowerCase();
    }

    public HomePet defineAnimal(HomePet animal){
        if (actionsForDog.contains(animal.getAction())) {
            System.out.println("Dog created");
            animal = new Dog(animal.getName(), animal.getAction());
            return animal;
        } else if (actionsForCat.contains(animal.getAction())) {
            System.out.println("Cat created");
            animal = new Cat(animal.getName(), animal.getAction());
            return animal;
        } else if (actionsForHamster.contains(animal.getAction())) {
            System.out.println("Hamster created");
            animal = new Hamster(animal.getName(), animal.getAction());
            return animal;
        } else {
            throw new NullPointerException("Wrong action!");
        }
    }

    public void TakeActions(){}
    public void AddActions(String command){}
}
