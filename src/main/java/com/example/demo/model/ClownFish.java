package com.example.demo.model;

import com.example.demo.model.behaviours.impl.OrangeColor;
import com.example.demo.model.behaviours.impl.SmallSize;

public class ClownFish extends Fish {
    public ClownFish(){
        colorBehaviour = new OrangeColor();
        sizeBehaviour = new SmallSize();
    }
}
