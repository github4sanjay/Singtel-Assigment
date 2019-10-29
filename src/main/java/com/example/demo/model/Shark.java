package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class Shark extends Fish {
    public Shark(){
        colorBehaviour = new GreyColor();
        sizeBehaviour = new LargeSize();
    }
}
