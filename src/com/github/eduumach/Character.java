package com.github.eduumach;

public class Character {
    private Behavior behavior;

    public void setBehavior(Behavior behavior){
        this.behavior = behavior;
    }

    public void steps(){
        behavior.steps();
    }



}
