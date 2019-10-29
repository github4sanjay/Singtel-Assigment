package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class Bird extends Animal {
    public Bird(){ // default behaviour
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new NoSound();
        swimBehaviour = new SwimNoWay();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkOnFeet();
    }
}