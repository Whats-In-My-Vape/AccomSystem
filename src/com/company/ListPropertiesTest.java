package com.company;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;


/**
 * Created by User1 on 02/11/2017.
 */

public class ListPropertiesTest {

    ListProperties list = new ListProperties();
    public Iterator<Property> iterator() {
        return list.iterator();
    }

    @Test
    public void addProperty() throws Exception {
        list.addProperty("address 4","cardboard box",0,20,10);
        list.addProperty("address 5","matress",4,6,100);
        list.addProperty("address 6","penthouse suite",9090,1000,2);
        list.addProperty("address 7","underpass",8,10,80);
        list.addProperty("address 8","jungle",2,7,12);

    }

    @Test
    public void findPropertyByAddress() throws Exception {
    }

    @Test
    public void listProperties() throws Exception {

    }


    @Test
    public void removeProperty() throws Exception {

    }


    }


