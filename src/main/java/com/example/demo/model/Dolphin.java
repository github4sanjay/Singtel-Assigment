package com.example.demo.model;

import com.example.demo.model.behaviours.*;
import com.example.demo.model.behaviours.impl.*;

public class Dolphin extends Animal {
    FlyBehaviour flyBehaviour;
    SingingBehaviour singingBehaviour;
    SoundBehaviour soundBehaviour;
    SwimBehaviour swimBehaviour;
    ColorBehaviour colorBehaviour;
    SizeBehaviour sizeBehaviour;

    public Dolphin(){
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new NoSound();
        swimBehaviour = new SwimByBody();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkNoWay();
        colorBehaviour = new GreyColor();
        sizeBehaviour = new LargeSize();
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
