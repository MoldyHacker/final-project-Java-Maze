package edu.wctc.maze;

public interface MazeConstructionStrategy {
    // Creates Room objects and links them together to form a maze.
    // Returns the Room in which the player begins the game (the starting room).
    Room createRooms();
}
