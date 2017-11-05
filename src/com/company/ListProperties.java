package com.company;

/**
 * ListProperties Class
 *
 * Created by User1 on 01/11/2017.
 */
import java.util.Iterator;

public class ListProperties implements Iterable<Property>{

    protected LinkedList<Property> propertyList = new LinkedList<>();

    @Override
    public Iterator<Property> iterator() {
        return propertyList.iterator();
    }

   //add a property to the list
    public void addProperty(String address, String propertyType, int floors, int dist, int parkingSpaces) {
        Property newProperty = new Property(address, propertyType, floors, dist, parkingSpaces);
        propertyList.add(newProperty);
        System.out.println(" You've just added: " + newProperty.toString());

    }

    //find a property by address
    public Property findPropertyByAddress(String propertyAddress) {
        for(Property prop : this){
            if (prop.getAddress().equals(propertyAddress)){
                return prop;
            }
        }
        System.out.println(propertyAddress + " not found.");
        return null;
    }
    //method for listing properties
    public void listProperties(){
     for (Property property : this) {
         System.out.println(property.toString());
     }
    }
    //method for listing by oarking spaces
    public void listParkingSpaces(){
        for(Property property : this) {
            System.out.println(property.getParkingSpace() + " , " + property.getPropertyType());
        }
    }
    //method for removing a property
    public void removeProperty(String propertyAddress){
        Property removeThisProperty = findPropertyByAddress(propertyAddress);
        if (removeThisProperty != null){
            propertyList.remove(removeThisProperty);
            System.out.println(propertyAddress + " has been removed");
        }
    }

}