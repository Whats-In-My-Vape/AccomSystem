package com.company;

import java.util.Iterator;

/**
 * LinkedList Class
 *
 * @author User1
 */

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
    public Student getStudentWithID(int studentId){
        for(Student student : this){
            if(student.getStudentId() == studentId){
                return student;
            }
        }
        System.out.println("Student Id" + studentId + " does not exist.");
        return null;
    }
    public void removeStudent(int student){
        // checks if bed exists
        Student revoke = getStudentWithID(student);
        // if it exists, ...removed.
        if (revoke != null){
            studentlist.remove(revoke);
            System.out.println(revoke + " has been removed");
        }
    }

    public void listStudents() {
        int studentId = 0;
        for (Student student : this) {
            studentId += 1;
            System.out.println(student.toString());
        }
    }
}

