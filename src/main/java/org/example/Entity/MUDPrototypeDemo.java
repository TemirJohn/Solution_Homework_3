package org.example.Entity;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room room = new Room("Entrance", "A dark and damp entrance.");
        NPC npc =  new NPC("Goblin", "A small but dangerous creature.", 50);
        NPC npcClone = npc.cloneEntity();
        Room roomClone = room.cloneEntity();
        System.out.println("Original:\n"+room+"\n"+npc+"\nClone:\n"+roomClone+"\n"+npcClone);


        npcClone.setNpcName("Zombie");
        npcClone.setNpcDescription("BRAAAAAAIN!");
        npcClone.setNpcHealth(10);


        roomClone.setRoomName("Grave");
        roomClone.setRoomDescription("this too many zombies...");
        System.out.println("Original:\n"+room+"\n"+npc+"\nClone:\n"+roomClone+"\n"+npcClone);

    }
}
