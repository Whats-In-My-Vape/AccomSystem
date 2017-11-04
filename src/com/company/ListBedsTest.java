package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Created by User1 on 02/11/2017.
 */


public class ListBedsTest {
    ListBeds list = new ListBeds();
    @Test
    public void addBed() throws Exception {
        list.addBed("double", 31, 23);
        list.addBed("single", 3, 24);
        list.addBed("king", 432, 25);
        list.addBed("double", 31, 26);
        list.listBeds();
    }

    @Test
    public void listBeds() throws Exception {

    }

    @Test
    public void getBedWithID() throws Exception {
    }

    @Test
    public void removeBed() throws Exception {
        list.removeBed(234);
    }



}
