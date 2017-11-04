package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * Created by User1 on 02/11/2017.
 */
public class ListStudentsTest {


    ListStudents list = new ListStudents();


    @Test
    public void listStudents() throws Exception {
        addStudent();
        list.listStudents();
    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addStudent() {
        list.addStudent("bob", "male", true , 23 );
        list.addStudent("bob", "M", false , 32 );
        list.addStudent("mary", "F", false , 2 );
        list.addStudent("olive", "M", true , 22 );


    }

}