package org.example.BuilderPattern;

import org.example.PrototypePattern.NPC;
import org.example.PrototypePattern.Room;

import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();
    private List<String> traps = new ArrayList<>();
    private List<String> treasures = new ArrayList<>();

    public SimpleDungeonBuilder(String name) {
        this.name = name;
    }

    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }

    public IDungeonBuilder addCloneNPC(NPC npc){
        npcs.add(npc.clone());
        return this;
    }

    public IDungeonBuilder addCloneRoom(Room room){
        rooms.add(room.clone());
        return this;
    }
    public IDungeonBuilder addTrap(String trap) {
        traps.add(trap);
        return this;
    }

    public IDungeonBuilder addTreasure(String treasure) {
        treasures.add(treasure);
        return this;
    }

    public Room getRoom(int index) {
        if (index >= 0 && index < rooms.size()) {
            return rooms.get(index);
        }
        return null;
    }

    public NPC getNpc(int index) {
        if (index >= 0 && index < npcs.size()) {
            return npcs.get(index);
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public Dungeon build() {
        return new Dungeon(name, rooms, npcs, traps, treasures);
    }
}
