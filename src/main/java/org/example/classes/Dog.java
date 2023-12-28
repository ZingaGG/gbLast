package org.example.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Dog extends HomePet{
    protected Dog(String name, String action){
        super.name = name;
        super.action = action;
    }

    @Override
    public String toString() {
        return "Dog name - " + name + " \n" +
                "Action - " + action;
    }

    @Override
    public void TakeActions(){
        for (String el:getActionsForDog())
        {
            System.out.println(el);
        }
    }

    @Override
    public void AddActions(String command){
        this.actionsForDog.add(command);
        TakeActions();
    }
}
