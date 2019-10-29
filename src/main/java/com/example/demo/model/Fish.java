package com.example.demo.model;

import com.example.demo.model.behaviours.*;
import com.example.demo.model.behaviours.impl.*;

public class Fish extends Animal {
    FlyBehaviour flyBehaviour;
    SingingBehaviour singingBehaviour;
    SoundBehaviour soundBehaviour;
    SwimBehaviour swimBehaviour;
    ColorBehaviour colorBehaviour;
    SizeBehaviour sizeBehaviour;

    public Fish(){ // default behaviour
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new NoSound();
        swimBehaviour = new SwimByBody();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkNoWay();
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
}
