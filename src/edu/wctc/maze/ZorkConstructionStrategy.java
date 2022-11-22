package edu.wctc.maze;

import edu.wctc.maze.roomimpl.BasicRoom;
import edu.wctc.maze.roomimpl.DarkRoom;
import edu.wctc.maze.roomimpl.SimpleRoom;

public class ZorkConstructionStrategy implements MazeConstructionStrategy{

    @Override
    public Room createRooms() {
        Room startingRoom = new BasicRoom();

        Room anotherRoom = new DarkRoom();
        startingRoom.setNorth(anotherRoom);
        anotherRoom.setSouth(startingRoom);

        Room thirdRoom = new SimpleRoom();
        anotherRoom.setDown(thirdRoom);
        thirdRoom.setUp(anotherRoom);

        Room finalRoom = new BasicRoom();
        anotherRoom.setEast(finalRoom);
        finalRoom.setWest(anotherRoom);

        // Return the starting room
        return startingRoom;
    }
}
