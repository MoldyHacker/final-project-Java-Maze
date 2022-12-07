package edu.wctc.maze;

public class NoCompanionException extends Exception{
    public NoCompanionException(){
        super("There is no companion waiting here");
    }
}
