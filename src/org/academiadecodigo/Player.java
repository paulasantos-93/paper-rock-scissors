package org.academiadecodigo;

/**
 * Player class
 */
public class Player {

    private String name;
    private int victories = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVictories() {
        return victories;
    }

    public void win() {
        victories++;
    }

    public GameHand chooseHand() {
        int randomIndex = (int) (Math.random() * GameHand.values().length);
        GameHand[] gameHands = GameHand.values();

        return gameHands[randomIndex];
    }

}
