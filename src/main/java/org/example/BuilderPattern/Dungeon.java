package org.example.BuilderPattern;

import org.example.Entity.NPC;
import org.example.Entity.Room;

import java.util.List;

public class Dungeon {
    private String dungeonName;
    private List<Room> dungeonRooms;
    private List<NPC> dungeonNPCs;

    public Dungeon(String dungeonName, List<Room> dungeonRooms, List<NPC> dungeonNPCs) {
        this.dungeonName = dungeonName;
        this.dungeonRooms = dungeonRooms;
        this.dungeonNPCs = dungeonNPCs;
    }


    public String toString() {
        String result = "Dungeon: " + dungeonName;

        result+= "\nRooms in the dungeon:\n";
        for (int i = 0; i < dungeonRooms.size(); i++) {
            result+=(i+1) +". " + dungeonRooms.get(i) + "\n";
        }

        result+="\nNPCs in the dungeon:\n";
        for (int i = 0; i < dungeonNPCs.size(); i++) {
            result+=(i+1) +". " + dungeonNPCs.get(i) + "\n";
        }

        return result;
    }
}
