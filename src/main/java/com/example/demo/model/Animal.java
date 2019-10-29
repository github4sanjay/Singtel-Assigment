package com.example.demo.model;

import com.example.demo.model.behaviours.*;

public class Animal {

    WalkBehaviour walkBehaviour;
    FlyBehaviour flyBehaviour;
    SingingBehaviour singingBehaviour;
    SoundBehaviour soundBehaviour;
    SwimBehaviour swimBehaviour;
    ColorBehaviour colorBehaviour;
    SizeBehaviour sizeBehaviour;

    void walk(){
        walkBehaviour.walk();
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public void sound() {
        soundBehaviour.sound();
    }

    public void sing() {
        singingBehaviour.sing();
    }

    public void swim() {
        swimBehaviour.swim();
    }

    public void size() {
        sizeBehaviour.size();
    }

    public void color() {
        colorBehaviour.color();
    }

    public boolean isFly(){
        return flyBehaviour.isFly();
    }

    public boolean isWalkable(){
        return walkBehaviour.isWalkable();
    }

    public boolean isSinger(){
        return singingBehaviour.isSinger();
    }

    public boolean isSwimmer(){
        return swimBehaviour.isSwimmer();
    }
}
