package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class ParrotLivingWithDogs extends Parrot{
    public ParrotLivingWithDogs(){
        soundBehaviour = new WoofSound();
    }
}
