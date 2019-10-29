package com.example.demo.model;

import com.example.demo.model.behaviours.*;
import com.example.demo.model.behaviours.impl.*;

public class Dolphin extends Animal {
    public Dolphin(){
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new NoSound();
        swimBehaviour = new SwimByBody();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkNoWay();
        colorBehaviour = new GreyColor();
        sizeBehaviour = new LargeSize();
    }
}
