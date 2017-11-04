package com.company;

/**
 * Property Class
 *
 * @author Kevin Power
 *
 */
public class Property {

    private String propertyType; // Flat,House...
    private String address;
    private int floors; //how many floors
    private int dist; //distance to with in km
    private int parkingSpaces;

    ListRooms listRooms = new ListRooms();

    public Property(){

    }

    // This is the Constructor for the Property Class.
    public Property(String address,String propertyType, int floors, int dist, int parkingSpaces) {
        this.propertyType = propertyType;
        this.address = sanitizeAddress(address);
        this.floors = floors;
        this.dist = dist;
        this.parkingSpaces = parkingSpaces;
    }

    //Getters
    public String getPropertyType() {
        return propertyType;
    }

    public String getAddress() {
        return address;
    }

    private String sanitizeAddress(String Address) {

        if (Address.length() > 50) {
            return Address.substring(0, 50);
        } else {
            return Address;
        }
    }

    public int getFloors() {
        return floors;
    }

    public int getDist() {
        return dist;
    }

    public int getParkingSpace() {
        return parkingSpaces;
    }

    //Setters
    public void setPropertyType(String type) {
        this.propertyType = propertyType;
    }

    public void setAddress(String address) {
        this.address = sanitizeAddress(address);
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public void setParkingSpace(int parkingSpace) {
        this.parkingSpaces = parkingSpaces;
    }

    @Override
    public String toString() {
        return "Property " +
                "address= " + address  + ", type=" + propertyType  + ", floors=" + floors  + ", dist=" + dist + ", parkingSpace=" + parkingSpaces;
    }
}
