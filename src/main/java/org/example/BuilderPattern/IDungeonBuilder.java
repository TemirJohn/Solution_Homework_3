package org.example.BuilderPattern;

import org.example.PrototypePattern.NPC;
import org.example.PrototypePattern.Room;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    IDungeonBuilder addCloneNPC(NPC npc);
    IDungeonBuilder addCloneRoom(Room room);
    IDungeonBuilder addTrap(String trap);
    IDungeonBuilder addTreasure(String treasure);
    Dungeon build();
}

