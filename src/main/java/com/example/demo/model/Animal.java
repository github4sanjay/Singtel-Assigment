package com.example.demo.model;

import com.example.demo.model.behaviours.*;
import com.example.demo.model.behaviours.impl.*;
import com.google.common.base.Objects;

public class Animal {

    WalkBehaviour walkBehaviour;
    FlyBehaviour flyBehaviour;
    SingingBehaviour singingBehaviour;
    SoundBehaviour soundBehaviour;
    SwimBehaviour swimBehaviour;
    ColorBehaviour colorBehaviour;
    SizeBehaviour sizeBehaviour;

    public Animal(){ // default behaviour
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new NoSound();
        swimBehaviour = new SwimNoWay();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkNoWay();
        colorBehaviour = new GreyColor();
        sizeBehaviour = new SmallSize();
    }

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

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("walkBehaviour", walkBehaviour.toString())
                .add("swimBehaviour", swimBehaviour.toString())
                .add("flyBehaviour", flyBehaviour.toString())
                .add("colorBehaviour", colorBehaviour.toString())
                .add("sizeBehaviour", sizeBehaviour.toString())
                .add("soundBehaviour", soundBehaviour.toString())
                .add("singingBehaviour", singingBehaviour.toString())
                .toString();
    }
}
