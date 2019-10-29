package com.example.demo.model;

import com.example.demo.model.behaviours.SwimBehaviour;
import com.example.demo.model.behaviours.impl.*;

public class Duck extends Bird{
    public Duck(){
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new QuackSound();
        swimBehaviour = new SwimByFeet();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkOnFeet();
    }
}
