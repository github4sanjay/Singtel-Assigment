package com.example.demo.model;

import com.example.demo.model.behaviours.impl.FlyWithWings;
import com.example.demo.model.behaviours.impl.MeowSound;
import com.example.demo.model.behaviours.impl.SwimNoWay;
import com.example.demo.model.behaviours.impl.WoofSound;

public class ParrotLivingWithCats extends Bird{
    public ParrotLivingWithCats(){
        flyBehaviour = new FlyWithWings();
        soundBehaviour = new MeowSound();
        swimBehaviour = new SwimNoWay();
    }
}
