package edu.wctc.maze.io;

public class ConsoleOutputService implements OutputService {
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
