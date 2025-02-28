package org.example.Entity;

import java.util.ArrayList;
import java.util.List;

public class Room implements CloneableGameEntity{
    private String roomName;
    private String roomDescription;
    private List<String> items;

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

    public Room cloneEntity() {
        Room clone = new Room(this.roomName, this.roomDescription);

        clone.items = new ArrayList<>(this.items);
        return clone;
    }
}
