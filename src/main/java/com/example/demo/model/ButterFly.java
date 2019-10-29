package com.example.demo.model;

import com.example.demo.model.behaviours.FlyBehaviour;
import com.example.demo.model.behaviours.impl.FlyNoWay;
import com.example.demo.model.behaviours.impl.NoSound;
import com.example.demo.model.behaviours.impl.WalkOnFeet;

public class ButterFly extends Animal {
    public ButterFly(){ // default behaviour
        walkBehaviour = new WalkOnFeet();
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new NoSound();
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) { // setting fly behaviour at runtime
        this.flyBehaviour = flyBehaviour;
    }
}
