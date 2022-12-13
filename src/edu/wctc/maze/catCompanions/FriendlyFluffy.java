package edu.wctc.maze.catCompanions;

import edu.wctc.maze.PrintQueueEnum;
import edu.wctc.maze.factory.Companion;

public class FriendlyFluffy implements Companion {
    @Override
    public String getName() {
        return "Fluffy the friendly cat";
    }

    @Override
    public void notifyPlayerGainedItem(String item) {
        PrintQueueEnum.INSTANCE.enqueue("Fluffy meows excitedly!");
    }

    @Override
    public void notifyPlayerScoreChanged(int amount) {
        if (amount > 0)
            PrintQueueEnum.INSTANCE.enqueue("Fluffy meows excitedly!");
        else
            PrintQueueEnum.INSTANCE.enqueue("Fluffy wraps around your leg.");
    }
}
