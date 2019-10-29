package com.example.demo.model;

import com.example.demo.model.behaviours.FlyBehaviour;
import com.example.demo.model.behaviours.impl.*;

public class ButterFly extends Animal {
    public ButterFly(){ // default behaviour
        walkBehaviour = new WalkOnFeet();
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new NoSound();
        singingBehaviour = new SingNoWay();
        swimBehaviour = new SwimNoWay();
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) { // setting fly behaviour at runtime
        this.flyBehaviour = flyBehaviour;
    }
}
