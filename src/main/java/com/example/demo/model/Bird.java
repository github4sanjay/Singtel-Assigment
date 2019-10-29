package com.example.demo.model;

import com.example.demo.model.behaviours.FlyBehaviour;
import com.example.demo.model.behaviours.SingingBehaviour;
import com.example.demo.model.behaviours.SoundBehaviour;
import com.example.demo.model.behaviours.SwimBehaviour;
import com.example.demo.model.behaviours.impl.*;

class Bird extends Animal {
    FlyBehaviour flyBehaviour;
    SingingBehaviour singingBehaviour;
    SoundBehaviour soundBehaviour;
    SwimBehaviour swimBehaviour;

    public Bird(){ // default behaviour
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new NoSound();
        swimBehaviour = new SwimNoWay();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkOnFeet();
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
}