package org.example.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Room implements CloneableGame {
    private String roomName;
    private String roomDescription;
    private List<String> items;
    private static int cloneCounter = 1;

    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.items = new ArrayList<>();
    }


    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public String toString() {
        return roomName + "\n" + roomDescription + "\nItems: " + items;
    }

    public Room clone() {
        Room clone = new Room(this.roomName, this.roomDescription);
        Room clonedRoom = new Room(this.roomName + " (Clone #" + cloneCounter + ")", this.roomDescription);
        cloneCounter++;
        clone.items = new ArrayList<>(this.items);
        return clone;
    }
}
