package org.example.BuilderPattern;

import org.example.Entity.NPC;
import org.example.Entity.Room;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder("Danger")
                .setDungeonName("The Dark Cave")
                .addRoom(new Room("Entrance", "A dark and damp entrance."))
                .addRoom(new Room("Treasure Chamber", "Glowing with gold and gems."))
                .addRoom(new Room("Monster Lair", "A chilling cave where monsters dwell."))
                .addNPC(new NPC("Goblin", "A small but dangerous creature.", 50))
                .addNPC(new NPC("Dragon", "A mighty beast guarding the treasure!", 500))
                .addTrap("Poison Spikes")
                .addTreasure("Ancient Sword")
                .build();

        System.out.println("Builded dungeon:");
        System.out.println(dungeon);
    }}
