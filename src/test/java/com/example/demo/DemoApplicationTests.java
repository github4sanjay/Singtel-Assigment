package com.example.demo;

import com.example.demo.model.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	Animal[] animals;
	@Before
	public void before(){
		animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Dolphin(),
				new ButterFly(),
		};
	}

	@Test
	public void testHowManyAnimalsCanFly() throws IllegalAccessException {
		int count = 0;
		for (Animal animal: animals){
			boolean fly = animal.isFly();
			if (fly) {
				count++;
			}
		}
		assert count == 1; // only parrot can fly
	}

	@Test
	public void testHowManyAnimalsCanWalk() throws IllegalAccessException {
		int count = 0;
		for (Animal animal: animals){
			boolean fly = animal.isWalkable();
			if (fly) {
				count++;
			}
		}
		assert count == 6; // bird, duck, chicken, rooster, parrot, butterfly
	}

	@Test
	public void testHowManyAnimalsCanSing() throws IllegalAccessException {
		int count = 0;
		for (Animal animal: animals){
			boolean fly = animal.isSinger();
			if (fly) {
				count++;
			}
		}
		assert count == 0; // no one can sing
	}

	@Test
	public void testHowManyAnimalsCanSwim() throws IllegalAccessException {
		int count = 0;
		for (Animal animal: animals){
			boolean fly = animal.isSwimmer();
			if (fly) {
				count++;
			}
		}
		assert count == 5; // duck, fish, dolphin, shark, clownfish
	}

}
