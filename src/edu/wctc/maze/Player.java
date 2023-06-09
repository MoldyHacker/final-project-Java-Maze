package edu.wctc.maze;

import edu.wctc.maze.factory.Companion;
import edu.wctc.maze.observer.PushObserver;

import java.util.ArrayList;
import java.util.List;

public class Player implements PushObserver {
    private boolean playing = true;

    private int score = 0;

    private List<String> inventory = new ArrayList<>();

    private List<Companion> companions = new ArrayList<>();

    public void addCompanion(Companion companion) {
        companions.add(companion);
    }

    public void removeCompanion(Companion companion) {
        companions.remove(companion);
    }

    public void addToInventory(String item) {
        inventory.add(item);

        // TODO Module 8: Notify all companions the player acquired a new item
        updateItem(item);

    }

    public void addToScore(int points) {
        score += points;

        // TODO Module 8: Notify all companions the player's score changed
        updateScore(points);
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

    @Override
    public void updateItem(String item) {

    }

    @Override
    public void updateScore(int points) {

    }
}
