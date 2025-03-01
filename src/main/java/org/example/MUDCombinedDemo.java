package org.example;

import org.example.BuilderPattern.Dungeon;
import org.example.BuilderPattern.SimpleDungeonBuilder;
import org.example.PrototypePattern.NPC;
import org.example.PrototypePattern.Room;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        Room EntranceOrig = new Room("Entrance", "A dark and damp entrance.");
        NPC GoblinOrig =  new NPC("Goblin", "A small but dangerous creature.", 50);
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder("The Dark Cave");
        builder.addNPC(GoblinOrig);
        builder.addRoom(EntranceOrig);
        builder.addCloneNPC(GoblinOrig);
        builder.addTrap("Poison Spikes");
        builder.addTreasure("Ancient Sword");

        Room clone1 = EntranceOrig.clone();
        System.out.println("Original Room: " + EntranceOrig.getRoomName());
        System.out.println("Cloned Rooms:");
        System.out.println(clone1.getRoomName());

        builder.addCloneRoom(EntranceOrig);
        builder.getRoom(1).setRoomName("The Light cave");
        builder.getNpc(1).setNpcName("Angel");
        Dungeon dungeon = builder.build();
        System.out.println(dungeon);
    }
}
