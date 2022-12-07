package edu.wctc.maze.dogCompanions;

import edu.wctc.maze.factory.Companion;
import edu.wctc.maze.factory.CompanionFactory;

public class DogCompanionFactory implements CompanionFactory {
    @Override
    public Companion getFriendlyCompanion() {
        return new DecentDodger();
    }

    @Override
    public Companion getSurlyCompanion() {
        return new VengefulVictor();
    }
}
