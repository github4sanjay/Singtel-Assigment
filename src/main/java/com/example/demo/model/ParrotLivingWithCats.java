package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class ParrotLivingWithCats extends Parrot{
    public ParrotLivingWithCats(){
        soundBehaviour = new MeowSound();
    }
}
