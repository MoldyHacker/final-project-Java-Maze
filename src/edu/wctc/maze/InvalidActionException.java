package edu.wctc.maze;

public class InvalidActionException extends Exception {
    public InvalidActionException() {
        super("You can't do that here!");
    }
}
