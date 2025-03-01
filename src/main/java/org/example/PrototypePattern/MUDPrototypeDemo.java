package org.example.PrototypePattern;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room room = new Room("Entrance", "A dark and damp entrance.");
        room.addItem("Torch");
        room.addItem("Key");

        NPC npc = new NPC("Goblin", "A small but dangerous creature.", 50);
        npc.addSkill("Stealth");
        npc.addSkill("Ambush");

        NPC npcClone = npc.clone();
        Room roomClone = room.clone();

        System.out.println("Original:\n" + room + "\n" + npc);
        System.out.println("Clone:\n" + roomClone + "\n" + npcClone);

        npcClone.setNpcName("Zombie");
        npcClone.setNpcDescription("BRAAAAAAIN!");
        npcClone.setNpcHealth(10);

        roomClone.setRoomName("Grave");
        roomClone.setRoomDescription("Too many zombies...");
        roomClone.addItem("Shovel");

        System.out.println("\nAfter modification:");
        System.out.println("Original:\n" + room + "\n" + npc);
        System.out.println("Clone:\n" + roomClone + "\n" + npcClone);
    }
}
