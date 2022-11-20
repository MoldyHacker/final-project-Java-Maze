package edu.wctc.maze;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Room {
    private String name, description;
    private Map<Character, Room> connectedRooms = new HashMap<>();

    // TODO Module 7: Create a field to hold this room's companion

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Room getAdjoiningRoom(char direction) throws NoAdjoiningRoomException {
        if (connectedRooms.containsKey(direction)) {
            return connectedRooms.get(direction);
        }

        throw new NoAdjoiningRoomException(direction);
    }

    public String getDescription() {
        // TODO Module 7: If this room contains a recruitable companion,
        //  append "{companion_name} is here" to the returned description

        return this.description;
    }

    public String getName() {
        return name;
    }

    public String getPossibleDirections() {
        List<String> directions = connectedRooms.keySet()
                .stream()
                .map(direction -> {
                    switch (direction) {
                        case 'n':
                            return "North";
                        case 's':
                            return "South";
                        case 'e':
                            return "East";
                        case 'w':
                            return "West";
                        case 'u':
                            return "Up";
                        case 'd':
                            return "Down";
                    }
                    return "";
                }).collect(Collectors.toList());

        return directions.isEmpty() ?
                "You don't see any exits." :
                "The exits are: " + String.join(", ", directions);
    }

    public abstract void performAction(char action, Player player) throws InvalidActionException;

    // TODO Module 7: Add method to recruit this room's companion:
    //  public void recruitCompanion(Player player)
    //  (Remember to use your PrintQueue to perform output as needed)

    // TODO Module 7: Add a setter method to set this room's companion

    public void setDown(Room room) {
        connectedRooms.put('d', room);
    }

    public void setEast(Room room) {
        connectedRooms.put('e', room);
    }

    public void setNorth(Room room) {
        connectedRooms.put('n', room);
    }

    public void setSouth(Room room) {
        connectedRooms.put('s', room);
    }

    public void setUp(Room room) {
        connectedRooms.put('u', room);
    }

    public void setWest(Room room) {
        connectedRooms.put('w', room);
    }
}
