package edu.wctc.maze.catCompanions;

import edu.wctc.maze.PrintQueueEnum;
import edu.wctc.maze.factory.Companion;

public class SassySally implements Companion {
    @Override
    public String getName() {
        return "Sally the sassy cat";
    }

    @Override
    public void notifyPlayerGainedItem(String item) {
        PrintQueueEnum.INSTANCE.enqueue("Sally meows excitedly!");
    }

    @Override
    public void notifyPlayerScoreChanged(int amount) {
        if (amount > 0)
            PrintQueueEnum.INSTANCE.enqueue("Sally hisses!");
        else
            PrintQueueEnum.INSTANCE.enqueue("Sally meows and rubs against your leg.");
    }
}
