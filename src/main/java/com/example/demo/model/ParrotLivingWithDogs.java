package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class ParrotLivingWithDogs extends Bird{
    public ParrotLivingWithDogs(){
        flyBehaviour = new FlyWithWings();
        soundBehaviour = new WoofSound();
        swimBehaviour = new SwimNoWay();
    }
}
