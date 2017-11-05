package com.company;

/**
 * Room Class
 *
 * @author User1
 *
 */
public class Room {

    private String roomType; //single,double...
    private int floorLevel;
    private boolean ensuite;
    private int roomId;
    ListBeds listBeds = new ListBeds();


    // This is the Constructor for the Room Class.
    public Room(String roomType, int floorLevel, boolean ensuite) {
        this.roomType = roomType;
        this.floorLevel = floorLevel;
        this.ensuite = ensuite;


    }

    public String getRoomType() {
        return roomType;
    }

    public int getFloorLevel() {
        return floorLevel;
    }

    public boolean isEnsuite() {
        return ensuite;
    }

    public int getRoomId() { return roomId; }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setFloor(int floorLevel) {
        this.floorLevel = floorLevel;
    }

    public void setEnsuite(boolean ensuite) {
        this.ensuite = ensuite;
    }

    public void setRoomId(int roomId){
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "Room #" + roomId +
                " roomType='" + roomType + '\'' +
                ", floor=" + floorLevel +
                ", ensuite=" + ensuite;
    }
}


