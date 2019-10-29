package com.example.demo.model;

import com.example.demo.model.behaviours.impl.FlyWithWings;
import org.junit.Test;

import static org.junit.Assert.*;

public class ButterFlyTest {

    @Test
    public void setFlyBehaviour() {
        ButterFly butterFly = new ButterFly(); // caterpillar
        butterFly.fly(); // no fly
        butterFly.setFlyBehaviour(new FlyWithWings()); // grown and can fly now
        butterFly.fly(); // can fly now
    }
}