package com.company;

import java.util.Iterator;


public class ListStudents implements Iterable<Student> {
    private LinkedList<Student> studentlist = new LinkedList<>();

    @Override
    public Iterator<Student> iterator() {
        return studentlist.iterator();
    }

    public void addStudent(String studentName, String studentGender, boolean car, int studentId) {
        Student newStudent = new Student(studentName, studentGender, car, studentId);
        studentlist.add(newStudent);
        System.out.println(" You've just added: " + newStudent.toString());


    }
    

    public void listStudents() {
        int studentId = 0;
        for (Student student : this) {
            studentId += 1;
            System.out.println(student.toString());
        }
    }
}

