package edu.wctc.maze.catCompanions;

import edu.wctc.maze.factory.Companion;
import edu.wctc.maze.factory.CompanionFactory;

public class CatCompanionFactory implements CompanionFactory {
    @Override
    public Companion getFriendlyCompanion() {
        return new FriendlyFluffy();
    }

    @Override
    public Companion getSurlyCompanion() {
        return new SassySally();
    }
}
