package org.example.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Hamster extends HomePet{
    protected Hamster(String name, String action){
        super.name = name;
        super.action = action;
    }

    @Override
    public String toString() {
        return "Hamster name - " + name + " \n" +
                "Action - " + action;
    }
    @Override
    public void TakeActions(){
        for (String el:getActionsForHamster())
        {
            System.out.println(el);
        }
    }
    @Override
    public void AddActions(String command){
        this.actionsForHamster.add(command);
        TakeActions();
    }
}
