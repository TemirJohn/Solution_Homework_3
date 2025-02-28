package org.example.Entity;

public class Room implements CloneableGameEntity{
    private String roomName;
    private String roomDescription;

    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
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
        return roomName + "\n" + roomDescription;
    }

    public Room cloneEntity() {
        return new Room(this.roomName + " (Clone)", this.roomDescription);
    }
}
