package edu.wctc.maze;

import edu.wctc.maze.observer.PushObservable;
import edu.wctc.maze.observer.PushObserver;

import java.util.ArrayList;
import java.util.List;

public class Maze implements PushObservable {
    private Room currentRoom;

    private Player player = new Player();

    /*
     * Maze receives its starting room from the construction strategy
     * in the Main class.
     */
    public Maze(Room startingRoom) {
        this.currentRoom = startingRoom;
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public String getCurrentRoomName() {
        return currentRoom.getName().toUpperCase();
    }

    public String getCurrentRoomPossibleDirections() {
        return currentRoom.getPossibleDirections();
    }

    public int getScore() {
        return player.getScore();
    }

    public boolean isPlaying() {
        return player.isPlaying();
    }

    public void performAction(char action) {
        switch (action) {
            case 'u':
            case 'd':
            case 'w':
            case 'e':
            case 's':
            case 'n':
                try {
                    PrintQueueEnum.INSTANCE.enqueue("You leave the " + currentRoom.getName());

                    currentRoom = currentRoom.getAdjoiningRoom(action);
                } catch (NoAdjoiningRoomException e) {
                    PrintQueueEnum.INSTANCE.enqueue(e.toString());
                }
                break;
            case 'v':
                PrintQueueEnum.INSTANCE.enqueue(player.getInventory());
                break;
            case 'r': // 'r' recruit companion
                try {
                    currentRoom.recruitCompanion(player);
                } catch (NoCompanionException e) {
                    PrintQueueEnum.INSTANCE.enqueue(e.toString());
                }
                break;
            default:
                // 'x' exit
                // 'l' loot
                // 'i' interact
                try {
                    currentRoom.performAction(action, player);
                } catch (InvalidActionException e) {
                    PrintQueueEnum.INSTANCE.enqueue(e.toString());
                }
                break;
        }
    }

    private List<PushObserver> observerList = new ArrayList<>();
    @Override
    public void addObserver(PushObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(pushObserver -> pushObserver.updateScore(player.getScore()));
    }

    @Override
    public void removeObserver(PushObserver observer) {
        observerList.add(observer);
    }
}
