package edu.wctc.maze.roomimpl;

import edu.wctc.maze.InvalidActionException;
import edu.wctc.maze.Player;
import edu.wctc.maze.Room;

public class DarkRoom extends Room {
    public DarkRoom() {
        super("Dark Room",
                "This room is pitch dark. You are likely to be eaten by a grue.");
    }

    @Override
    public void performAction(char action, Player player) throws InvalidActionException {
        if (action == 'i') {
            player.addToScore(-5);
            // TODO Module 6: Enqueue the message
            //  "Does stumbling around bumping into things count as interacting?"
        } else {
            throw new InvalidActionException();
        }
    }
}
