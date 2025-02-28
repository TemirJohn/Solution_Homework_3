package org.example.BuilderPattern;

import org.example.Entity.NPC;
import org.example.Entity.Room;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    IDungeonBuilder addCloneNPC(NPC npc);
    IDungeonBuilder addCloneRoom(Room room);
    Dungeon build();
}

