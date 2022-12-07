package edu.wctc.maze;


import edu.wctc.maze.catCompanions.CatCompanionFactory;
import edu.wctc.maze.factory.CompanionFactory;
import edu.wctc.maze.io.ConsoleInputService;
import edu.wctc.maze.io.ConsoleOutputService;
import edu.wctc.maze.io.InputService;
import edu.wctc.maze.io.OutputService;

public class Main {
    public static void main(String[] args) {
        InputService in = new ConsoleInputService();

        OutputService out = new ConsoleOutputService();

        CompanionFactory companionFactory = new CatCompanionFactory();

        MazeConstructionStrategy rooms = new ZorkConstructionStrategy(companionFactory);



        Maze maze = new Maze(rooms.createRooms());

        while (maze.isPlaying()) {
            out.print(maze.getCurrentRoomName());

            out.print(maze.getCurrentRoomDescription());

            out.print(maze.getCurrentRoomPossibleDirections());

            char command = in.getInput();
            maze.performAction(command);

            out.print(PrintQueueEnum.INSTANCE.flush());
        }

        out.print("GAME OVER");
        out.print("Score: " + maze.getScore());
    }
}
