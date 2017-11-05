package com.company;

import java.util.Iterator;

public class ListBeds implements Iterable<Bed>
{

    private LinkedList<Bed> bedList = new LinkedList<>();
    Bed bed;


    @Override
    public Iterator<Bed> iterator() {
        return bedList.showList();
    }

    public void addBed(String bedSize, int cost, int bedID){
        Bed newBed = new Bed(bedSize, cost, bedID);
        bedList.add(newBed);
        System.out.println(" You've just added: " + newBed.toString());

    }
    public void listBeds() {

        int bedId = 0;

        for (Bed bed : this) {

            bedId += 1;

            bed.setBedID(bedId);
            System.out.println(bed.toString());
        }//yes this overwrites bedID i know
    }
    public Bed getBedWithID(int bedID){
        for(Bed bed : this){
            if(bed.getBedID() == bedID){
                return bed;
            }
        }
        System.out.println("Bed ID" + bedID + " does not exist.");
        return null;
    }

    public void removeBed(int bed){
        // checks if bed exists
        Bed revoke = getBedWithID(bed);
        // if it exists, ...removed.
        if (revoke != null){
            bedList.remove(revoke);
            System.out.println(revoke + " has been removed");
        }
    }
}
