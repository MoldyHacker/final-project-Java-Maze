package edu.wctc.maze;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private boolean playing = true;

    private int score = 0;

    private List<String> inventory = new ArrayList<>();

    // TODO Module 7: Add list of companions

    // TODO Module 7: Add method to add new companion to the list

    // TODO Module 7: Add method to remove a companion from the list

    public void addToInventory(String item) {
        inventory.add(item);

        // TODO Module 8: Notify all companions the player acquired a new item

    }

    public void addToScore(int points) {
        score += points;

        // TODO Module 8: Notify all companions the player's score changed

    }

    public String getInventory() {
        if (inventory.isEmpty()) {
            return "Your pockets are empty!";
        }

        String inv = "You are carrying: ";
        inv += String.join(", " , inventory);

        return inv;
    }

    public int getScore() {
        return score;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void quit() {
        playing = false;
    }

}
