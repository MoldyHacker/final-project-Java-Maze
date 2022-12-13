package edu.wctc.maze.dogCompanions;

import edu.wctc.maze.PrintQueueEnum;
import edu.wctc.maze.factory.Companion;

public class DecentDodger implements Companion {
    @Override
    public String getName() {
        return "Dodger the decent dog";
    }

    @Override
    public void notifyPlayerGainedItem(String item) {
        PrintQueueEnum.INSTANCE.enqueue("Dodger barks excitedly!");
    }

    @Override
    public void notifyPlayerScoreChanged(int amount) {
        if (amount > 0)
            PrintQueueEnum.INSTANCE.enqueue("Dodger barks excitedly!");
        else
            PrintQueueEnum.INSTANCE.enqueue("Dodger whimpers by your side.");
    }
}
