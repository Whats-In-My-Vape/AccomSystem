package com.company;

/**
 * Student Class
 *
 * @author Kevin Power
 *
 */

public class Student {

    public static final String MALE = "M";
    public static final String FEMALE = "F";
    public static final String UNSPECIFIED = "Unspecified";

    private String studentName;
    private String studentGender;
    private boolean car;
    private int studentId;
    ListStudents listStudents = new ListStudents();


    public Student(String studentName, String studentGender, boolean car, int studentId) {
        this.studentName = sanitizeStudentName(studentName);
        this.studentGender = sanitizeStudentGender(studentGender);
        this.car = car;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    private String sanitizeStudentName(String studentName) {

        if (studentName.length() > 30) {
            return studentName.substring(0, 30);
        } else {
            return studentName;
        }
    }

    public void setStudentName(String studentName) {
        this.studentName = sanitizeStudentName(studentName);
    }

    public String getStudentGender() {
        return studentGender;
    }

    private String sanitizeStudentGender(String studentGender) {

        if (studentGender == MALE) {
            return MALE;
        } else if (studentGender == FEMALE) {
            return FEMALE;
        } else {
            return UNSPECIFIED;
        }
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = sanitizeStudentGender(studentGender);
    }

    public boolean isCar() {
        return car;
    }

    public void setCar(boolean car) {
        this.car = car;
    }

    public int getStudentId() {
        return studentId;
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return  "studentName=" + studentName + ", studentGender=" + studentGender  + ", car=" + car + ", studentId=" + studentId;
    }
}
