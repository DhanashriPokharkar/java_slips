/*
 * Write a program to create a package name student. Define class StudentInfo with method to
    display information about student such as rollno, class, and percentage. Create another class
    StudentPer with method to find percentage of the student. Accept student details like
    rollno, name, class and marks of 6 subject from user.
 */

import Student.StudentInfo;
import Student.StudentPer;

public class slip10_2 {
    public static void main(String args[]) {
        StudentInfo si = new StudentInfo(1, 30, "TY");
        StudentPer sp = new StudentPer(60, 40, 69, 20, 20, 80);

        si.getInfo();
        sp.calcPer();
    }
}
