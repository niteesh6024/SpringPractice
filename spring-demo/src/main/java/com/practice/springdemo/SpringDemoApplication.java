package com.practice.springdemo;

import com.practice.springdemo.game.GameRunner;
import com.practice.springdemo.game.MarioGame;
import com.practice.springdemo.game.PackMan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var pacMan = new PackMan();
		var gameRunner = new GameRunner(pacMan);

		gameRunner.run();
	}


}
