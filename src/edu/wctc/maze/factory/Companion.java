package edu.wctc.maze.factory;

public interface Companion {
    String getName();
    void notifyPlayerGainedItem(String item);
    void notifyPlayerScoreChanged(int amount);
}
