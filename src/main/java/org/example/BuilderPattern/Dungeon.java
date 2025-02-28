package org.example.BuilderPattern;

import org.example.Entity.NPC;
import org.example.Entity.Room;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private String dungeonName;
    private List<Room> dungeonRooms;
    private List<NPC> dungeonNPCs;
    private List<String> traps = new ArrayList<>();
    private List<String> treasures = new ArrayList<>();

    public Dungeon(String dungeonName, List<Room> dungeonRooms, List<NPC> dungeonNPCs, List<String> traps, List<String> treasures) {
        this.dungeonName = dungeonName;
        this.dungeonRooms = dungeonRooms;
        this.dungeonNPCs = dungeonNPCs;
        this.traps = traps;
        this.treasures = treasures;
    }

    public String getDungeonName() {
        return dungeonName;
    }

    public List<Room> getDungeonRooms() {
        return dungeonRooms;
    }

    public void setDungeonRooms(List<Room> dungeonRooms) {
        this.dungeonRooms = dungeonRooms;
    }

    public List<NPC> getDungeonNPCs() {
        return dungeonNPCs;
    }

    public void setDungeonNPCs(List<NPC> dungeonNPCs) {
        this.dungeonNPCs = dungeonNPCs;
    }

    public List<String> getTraps() {
        return traps;
    }

    public void setTraps(List<String> traps) {
        this.traps = traps;
    }

    public List<String> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<String> treasures) {
        this.treasures = treasures;
    }

    public void setDungeonName(String dungeonName) {
        this.dungeonName = dungeonName;
    }

    public void addTrap(String trap) { traps.add(trap); }
    public void addTreasure(String treasure) { treasures.add(treasure); }

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
