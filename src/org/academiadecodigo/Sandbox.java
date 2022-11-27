package org.academiadecodigo;

/**
 * Application entry point
 */
public class Sandbox {

    public static void main(String[] args) {

        Player playerOne = new Player("Rui");
        Player playerTwo = new Player("Campelo");

        Game g = new Game(10, playerOne, playerTwo);
        g.start();

    }
}
