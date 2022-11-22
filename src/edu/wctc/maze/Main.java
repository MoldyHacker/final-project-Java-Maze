package edu.wctc.maze;


import edu.wctc.maze.io.ConsoleInputService;
import edu.wctc.maze.io.ConsoleOutputService;
import edu.wctc.maze.io.InputService;
import edu.wctc.maze.io.OutputService;

public class Main {
    public static void main(String[] args) {
        InputService in = new ConsoleInputService();

        OutputService out = new ConsoleOutputService();

        MazeConstructionStrategy rooms = new ZorkConstructionStrategy();

        // TODO Module 7: Create a companion factory and pass it to the construction strategy

        // TODO Module 5: Create a construction strategy to replace the static
        //  createRooms method in main. Use it below.
        Maze maze = new Maze(rooms.createRooms());

        while (maze.isPlaying()) {
            out.print(maze.getCurrentRoomName());

            out.print(maze.getCurrentRoomDescription());

            out.print(maze.getCurrentRoomPossibleDirections());

            char command = in.getInput();
            maze.performAction(command);

            // TODO Module 6: Flush the print queue to the output service
        }

        out.print("GAME OVER");
        out.print("Score: " + maze.getScore());
    }
}
