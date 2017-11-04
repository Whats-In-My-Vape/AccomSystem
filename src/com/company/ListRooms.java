package com.company;

/**
 * Created by User1 on 01/11/2017.
 */
import java.util.Iterator;

public class ListRooms implements Iterable<Room> {

    private LinkedList<Room> roomList = new LinkedList<>();


    @Override // Is this required?? Yes but is it a duplicate?
    public Iterator<Room> iterator() {
        return roomList.iterator();
    }


    /*
    * Adds a single room to the room list.
    * */
    public void addRoom(String roomType, int floor, boolean ensuite) {
        Room newRoom = new Room(roomType, floor, ensuite);
        roomList.add(newRoom);
        System.out.println(" You've just added: " + newRoom.toString());
    }
    //method for listing rooms
    public void listRooms() {

        int roomId = 0;

        for (Room room : this) {

            roomId += 1;

            room.setRoomId(roomId);
            System.out.println(room.toString());
        }
    }
    //method for getting a room with the id
    public Room getRoomWithNumber(int roomNumber){
        for(Room room : this){
            if(room.getRoomId() == roomNumber){
                return room;
            }
        }
        System.out.println("Room #" + roomNumber + " does not exist.");
        return null;
    }
    //method for counting rooms
    public int roomCount(){
        int roomExist = 0;
        for(Room room : this){
            roomExist += 1;
        }
        return roomExist;
    }

    //method for getting the room id
    public Room getRoomWithId(int roomId) {
        for (Room room : this) {
            int target = room.getRoomId();
            if (roomId == target) {
                return room;
            }
        }
        return null;
    }
    public void removeRoom(int room){
        Room remove = getRoomWithNumber(room);
        if (remove != null){
            roomList.remove(room);
            System.out.println(remove + " has been removed");
        }
    }
}
