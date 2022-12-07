package edu.wctc.maze;

import edu.wctc.maze.factory.CompanionFactory;
import edu.wctc.maze.roomimpl.BasicRoom;
import edu.wctc.maze.roomimpl.DarkRoom;
import edu.wctc.maze.roomimpl.SimpleRoom;

public class ZorkConstructionStrategy implements MazeConstructionStrategy{

    CompanionFactory companionFactory;
    public ZorkConstructionStrategy(CompanionFactory companionFactory) {
        this.companionFactory = companionFactory;
    }

    @Override
    public Room createRooms() {
        Room startingRoom = new BasicRoom();
        startingRoom.setCompanion(companionFactory.getFriendlyCompanion());

        Room anotherRoom = new DarkRoom();
        startingRoom.setNorth(anotherRoom);
        anotherRoom.setSouth(startingRoom);

        Room thirdRoom = new SimpleRoom();
        anotherRoom.setDown(thirdRoom);
        thirdRoom.setUp(anotherRoom);
        thirdRoom.setCompanion(companionFactory.getSurlyCompanion());

        Room finalRoom = new BasicRoom();
        anotherRoom.setEast(finalRoom);
        finalRoom.setWest(anotherRoom);


        // Return the starting room
        return startingRoom;
    }
}
