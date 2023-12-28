package org.example.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Cat extends HomePet{
    protected Cat(String name, String action){
        super.name = name;
        super.action = action;
    }

    @Override
    public String toString() {
        return "Cat name - " + name + " \n" +
                "Action - " + action;
    }

    @Override
    public void TakeActions(){
        for (String el:getActionsForCat())
        {
            System.out.println(el);
        }
    }

    @Override
    public void AddActions(String command){
        this.actionsForCat.add(command);
        TakeActions();
    }
}
