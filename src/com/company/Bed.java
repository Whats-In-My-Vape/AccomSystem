package com.company;

/**
 * Bed Class
 *
 * @author Kevin Power
 *
 */

public class Bed {

    private String bedType;
    private int bedCost;
    private int bedID;

    public Bed(String bedType, int bedCost, int bedID){
        this.bedType = bedType;
        this.bedCost = bedCost;
        this.bedID = bedID;
    }

    // Where to determine the ID? In the Driver maybe? This class assumes that's where it will be placed.

    public String getBedType() {
        return bedType;
    }

    public int getBedCost() {
        return bedCost;
    }

    public int getBedID() {
        return bedID;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public void setBedCost(int bedCost) {
        this.bedCost = bedCost;
    }

    public void setBedID(int bedID) {
        this.bedID = bedID;
    }

    @Override
    public String toString() {
        return "Bed" +
                "bedType=" + bedType  +
                ", bedCost=" + bedCost +
                ", bedID=" + bedID;
    }
}
