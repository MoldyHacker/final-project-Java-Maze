package edu.wctc.maze.dogCompanions;

import edu.wctc.maze.PrintQueueEnum;
import edu.wctc.maze.factory.Companion;

public class VengefulVictor implements Companion {
    @Override
    public String getName() {
        return "Victor the vengeful dog";
    }

    @Override
    public void notifyPlayerGainedItem(String item) {
        PrintQueueEnum.INSTANCE.enqueue("Victor barks aggressively!");
    }

    @Override
    public void notifyPlayerScoreChanged(int amount) {
        if (amount > 0)
            PrintQueueEnum.INSTANCE.enqueue("Victor lets out a sigh");
        else
            PrintQueueEnum.INSTANCE.enqueue("Victor howls excitedly");
    }
}
