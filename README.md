# Final Project
Starter project for Modules 5-8 which will showcase several design patterns: strategy, singleton, abstract factory, and observer.

This is a version of the Maze game from Java Programming 152-130.

In the game, the player must navigate their way through a text adventure maze
of Room objects. Rooms are connected to each other in the cardinal compass
directions (North, South, East, West), as well as Up and Down directions.

The player issues single-letter commands at a console prompt:
- n,s,e,w,u,d - Movement commands (north, south, east, west, up, down)
- v - Display the player's current inventory
- l - Try to loot the room
- i - Try to interact with the room
- x - Try to exit the maze
- r - Recruit a companion to follow the player

The game continues until the player tries to exit the maze (command 'x') while in a room that allows that action.
