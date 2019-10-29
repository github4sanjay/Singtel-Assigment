package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class ParrotLivingWithCats extends Bird{
    public ParrotLivingWithCats(){
        flyBehaviour = new FlyWithWings();
        soundBehaviour = new MeowSound();
        swimBehaviour = new SwimNoWay();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkOnFeet();
    }
}
