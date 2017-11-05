package com.company;



import java.util.Scanner;

/**
 * Main Class
 *
 * @author Kevin Power
 *
 */
public class Main {
    private ListProperties propertyList = new ListProperties();
    private ListRooms roomList = new ListRooms();
    private ListBeds bedList = new ListBeds();

    Scanner scan = new Scanner(System.in);
    private LinkedList<Property> prop = propertyList.propertyList;
    private Property property;
    private int bedID = 0;


    public static void main(String[] args) {
        // write your code here
        Main app = new Main();
    }

    private String printStartMenu()
    {
        System.out.println("_________________");
        System.out.println("§   Property(p  §");
        System.out.println("§   Student(s)  §");
        System.out.println("§   Room(r)     §");
        System.out.println("§   Bed(b)      §");
        System.out.println("§   Back out(o) §");
        System.out.println("_________________");
        System.out.println("   -----------   ");
        System.out.println("   e) Exit");
        System.out.print("==>> ");
        String option = scan.next();
        option = option.toLowerCase();
        return option;
    }

    public Main(){
        propertyList.addProperty("address 1","flat",4,1,9);
        propertyList.addProperty("address 2","house",1,2,60);
        propertyList.addProperty("address 3","tent",1,600,40);
        propertyList.addProperty("address 4","cardboard box",0,20,10);
        propertyList.addProperty("address 5","matress",4,6,100);
        propertyList.addProperty("address 6","penthouse suite",9090,1000,2);
        propertyList.addProperty("address 7","underpass",8,10,80);
        propertyList.addProperty("address 8","jungle",2,7,12);

        roomList.addRoom("single", 2,true);
        roomList.addRoom("double", 4,true);
        roomList.addRoom("single", 2,false);
        roomList.addRoom("double", 7,false);
        roomList.addRoom("single", 3,true);

        bedList.addBed("single", 23, 1);
        bedList.addBed("single", 20, 2);
        bedList.addBed("double", 45, 3);
        bedList.addBed("bunk", 30, 4);
        bedList.addBed("single", 20, 5);


        startMenu();

    }

    private void startMenu()
    {
        String option = printStartMenu();
        while (!option.equals("e")) {

            switch (option) {
                case "p":
                    propertyMenu();//done
                    break;
                case "s":
                    studentMenu();
                    break;
                case "r":
                    roomMenu();//done
                    break;
                case "b":
                    bedMenu();
                    break;
                case "o":
                    backOut();
                    break;

                default:
                    System.out.println("Invalid option entered: " + option);
                    break;
            }
            //pause the program so that the user can read what we just printed to the terminal window
            System.out.println("\nPress Return to continue...");
            scan.nextLine();
            scan.nextLine();

            option = printStartMenu();
        }
        exitApp();
    }


    private String property()
    {
        System.out.println("Property Search Menu");
        System.out.println("What are you searching for?");
        System.out.println("______________________");
        System.out.println("§  Show all(s)       §");
        System.out.println("§  Add (a)           §");
        System.out.println("§  Remove (r)        §");
        System.out.println("§  By Distance(d)    §");
        System.out.println("§  Parking spaces(p) §");
        System.out.println("§  Back out(o)       §");
        System.out.println("______________________");
        System.out.println("   ----------------   ");
        System.out.println("   e) Exit");
        System.out.print("==>> ");
        String option = scan.next();
        option = option.toLowerCase();
        return option;
    }
    private void propertyMenu()
    {
        String option = property();
        while (!option.equals("e"))
        {
            switch (option)
            {
                case "s":
                    showAll();
                    break;
                case "a":
                    propertyAdd();
                case "r":
                    propertyRemove();
                    break;
                case "d":
                    distance();//error
                    break;
                case "p":
                    parkingSpaces();
                    break;
                case "o":
                    backOut();
                    break;
            }
            System.out.println("\nPress Return to continue...");
            scan.nextLine();
            scan.nextLine();

            option = property();
        }

    }

    private String room()
    {
        System.out.println("Property Search Menu");
        System.out.println("What are you searching for?");
        System.out.println("______________________");
        System.out.println("§  Show all(s)       §");
        System.out.println("§  Add (a)           §");
        System.out.println("§  Remove (r)        §");
        System.out.println("§  Back out(o)       §");
        System.out.println("______________________");
        System.out.println("   ----------------   ");
        System.out.println("   e) Exit");
        System.out.print("==>> ");
        String option = scan.next();
        option = option.toLowerCase();
        return option;
    }
    private void roomMenu() {
        String option = room();
        while (!option.equals("e")) {
            switch (option) {
                case "s":
                    showAllRooms();
                    break;
                case "a":
                    addRoom();
                    break;
                case "r":
                    removeRoom();
                    break;
                case "o":
                    backOut();
                    break;
            }
            System.out.println("\nPress Return to continue...");
            scan.nextLine();
            scan.nextLine();

            option = room();
        }

    }
    private String bed()
    {
        System.out.println("Property Search Menu");
        System.out.println("What are you searching for?");
        System.out.println("______________________");
        System.out.println("§  Show all(s)       §");
        System.out.println("§  Add (a)           §");
        System.out.println("§  Remove (r)        §");
        System.out.println("§  Back out(o)       §");
        System.out.println("______________________");
        System.out.println("   ----------------   ");
        System.out.println("   e) Exit");
        System.out.print("==>> ");
        String option = scan.next();
        option = option.toLowerCase();
        return option;
    }
    private void bedMenu() {
        String option = bed();
        while (!option.equals("e")) {
            switch (option) {
                case "s":
                    showAllBeds();
                    break;
                case "a":
                    addBed();
                    break;
                case "r":
                    removeBed();
                    break;
                case "o":
                    backOut();
                    break;
            }
            System.out.println("\nPress Return to continue...");
            scan.nextLine();
            scan.nextLine();

            option = bed();
        }

    }
    private void studentMenu(){

    }


    private void backOut(){
        startMenu();
    }


    private void showAll(){
        propertyList.listProperties();
    }
    private void distance(){
        System.out.println("Enter a distance ");
        int i = scan.nextInt();
        try {
            int j = 0;

                while (property.getDist() >= i && prop.getSize()> j) {
                    System.out.println("Properties within this distance" + property.getDist());
                }
                System.out.println(property.getDist() + " , " + property.getParkingSpace() + " , " + property.getAddress());
                j++;

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void parkingSpaces(){
            propertyList.listParkingSpaces();
    }
    private void propertyAdd(){
        System.out.print("Please enter the address: ");
        String address = scan.nextLine();
        System.out.print("Please enter the Property Type: ");
        String propertyType = scan.nextLine();
        System.out.print("Please enter number of floors in the building: ");
        int floors = scanInt();
        System.out.print("Please enter distance to WIT: ");
        int dist = scanInt();
        System.out.print("Please enter number of car parking spaces: ");
        int spaces = scanInt();
        propertyList.addProperty(address, propertyType, floors, dist, spaces);

    }
    private void propertyRemove(){
        propertyList.removeProperty(this.findProperty());
    }
    private String findProperty(){
        System.out.println(" What is the address of the property?");
        return scan.nextLine();
    }

    private void showAllRooms(){
        roomList.listRooms();
    }

  private void addRoom(){
      System.out.print("Please enter the address: ");
      String address;
      address = scan.nextLine();
      addRoom(address);
  }
    private void addRoom(String address){
        String roomType;
        int floorLevel;
        boolean ensuite, extras = true;
        Property propertyFind = propertyList.findPropertyByAddress(address);
        while(extras) {
            System.out.println(" Is it a Single or Double Room?");
            roomType = scan.nextLine();
            System.out.println(" What floor is it on?");
            floorLevel = scanInt();
            System.out.println(" Does it have an en-suite? (Yes or No)");
            String answer;
            answer = scan.nextLine();
            if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y")) {
                ensuite = true;
            } else {
                ensuite = false;
            }
            propertyFind.listRooms.addRoom(roomType, floorLevel, ensuite);
            propertyFind.listRooms.listRooms();
            System.out.println("Would you like to add another room? (Yes or No)");
            answer = scan.nextLine();
            if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y")) {
                extras = true;
            } else {
                extras = false;
            }
        }
    }


    private void removeRoom(){
        Property property = propertyList.findPropertyByAddress(findProperty());
        property.listRooms.listRooms();
        System.out.println(" Which room would you like to remove?");
        property.listRooms.removeRoom(scanInt());
    }

    private void showAllBeds(){
        bedList.listBeds();
    }

    private void addBed(){
        System.out.print("What property address would you like to add a bed to?");
        String address = scan.nextLine();
        String targetProperty = scan.nextLine();
        Property property = propertyList.findPropertyByAddress(targetProperty);
        if (property != null) {
            if (property.listRooms.roomCount() > 0) {
                addBed(address);
            } else System.out.println("Sorry, no Rooms have been assigned to this property yet.");
        }
    }
    private void addBed(String address) {
        System.out.println(" In which Room would you like to add a Bed?");
        Property currentProperty = propertyList.findPropertyByAddress(address);
        currentProperty.listRooms.listRooms(); // error I think this is empty
        int roomChoice = scanInt();
        Room currentRoom = currentProperty.listRooms.getRoomWithNumber(roomChoice);
        if (currentRoom != null){
            //add bed
            String bedType;
            int bedCost, bedID;
            boolean additions = true;
            while (additions) {
                boolean valid = false;
                while (!valid) {
                    //what kind of bed
                    System.out.println(" What type of Bed would you like to add?");
                    System.out.println("________________");
                    System.out.println("§   Choose     §");
                    System.out.println("§  Single(1)   §");
                    System.out.println("§  Double(2)   §");
                    System.out.println("§  Bunk(3)     §");
                    System.out.println("________________");
                    System.out.println("   ----------   ");
                    int bedChoice = scanInt();
                    if (bedChoice == 1) {
                        bedType = "Single";
                        bedCost = bedCost();
                        bedID = bedID();
                        currentRoom.listBeds.addBed(bedType, bedCost, bedID);
                        valid = true;
                    }
                    if (bedChoice == 2) {
                        bedType = "Double";
                        bedCost = bedCost();
                        bedID = bedID();
                        currentRoom.listBeds.addBed(bedType, bedCost, bedID);
                        valid = true;
                    }
                    if (bedChoice == 3) {
                        bedType = "Bunk";
                        bedCost = bedCostBunk();
                        bedID = bedID();
                        currentRoom.listBeds.addBed(bedType, bedCost, bedID);
                        bedID = bedID();
                        currentRoom.listBeds.addBed(bedType, bedCost, bedID);
                        valid = true;
                    }
                }
                System.out.println("Would you like to add another bed? (Yes or No)");
                String answer = scan.nextLine();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y")) {
                    additions = true;
                } else {
                    additions = false;
                }
            }
        }
    }
    private int bedCost(){
        System.out.println(" What is the cost to book this bed?");
            return scanInt();
    }

    private int bedCostBunk(){
        System.out.println(" What is the cost to book each bunk?");
            return scanInt();
    }
    private int bedID(){
        bedID += 1;
        return  bedID;
    }
    private void removeBed(){
        // finds the property where the bed you want to remove is
        Property property = propertyList.findPropertyByAddress(findProperty());
        property.listRooms.listRooms();
        System.out.println(" From which room would you like to remove a bed?");
        Room room = property.listRooms.getRoomWithNumber(scanInt());
        room.listBeds.listBeds();
        System.out.println(" Which bed would you like to remove?");
        room.listBeds.removeBed(scanInt());

    }

    private int scanInt(){
        boolean validInput = false;
        int option = -1;
        while (!validInput) {
            try {
                option = scan.nextInt();
                scan.nextLine();
                validInput = true;
         } catch (Exception e)
            {
                String waste = scan.nextLine();
                System.out.println("Number expected, you entered text - try again.");
        }
    }
        return option;
}
    private void exitApp(){
        System.out.println("Exiting App");
        System.exit(0);
    }
}


