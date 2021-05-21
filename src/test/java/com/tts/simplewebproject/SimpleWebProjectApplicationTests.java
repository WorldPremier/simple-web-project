package com.tts.simplewebproject;

import com.tts.simplewebproject.model.Actors;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleWebProjectApplicationTests {

	@Test
	public void simpleTest(){
		Actors actors = new Actors(1,"Franky");
		System.out.println(actors);
	}

}
