package com.github.eduumach;

public class Main {
    public static void main(String[] args) {
        Behavior normal = new Normal();
        Behavior mushroom = new Mushroom();

        Character character = new Character();

        character.setBehavior(normal);
        character.steps();
        character.steps();
        character.steps();
        character.setBehavior(mushroom);
        character.steps();
        character.steps();

    }
}
