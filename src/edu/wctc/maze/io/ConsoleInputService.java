package edu.wctc.maze.io;

import edu.wctc.maze.InvalidActionException;

import java.util.Scanner;

public class ConsoleInputService implements InputService {

    private Scanner keyboard = new Scanner(System.in);

    @Override
    public char getInput() {
        System.out.print(">> ");

        String input = keyboard.nextLine();
        if (input == null || input.isBlank())
            return '\u0000'; // null character

        char command = input.toLowerCase().charAt(0);

        return command;
    }
}
