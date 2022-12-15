package com.in28minuts.learnspringframework;

import com.in28minuts.learnspringframework.game.GameRunner;
import com.in28minuts.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame(); //1: Object creation
        var gameRunner = new GameRunner(game);
        //2: Object Creation + Wiring of dependencies
        //game is a dependency of GameRunner


        gameRunner.run();
    }
}
