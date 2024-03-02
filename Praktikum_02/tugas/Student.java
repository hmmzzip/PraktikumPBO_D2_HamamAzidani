/*
Nama : Hamam Azidani
NIM : 24060122130099
Nama file : Titik.java
Deskripsi : File untuk class Student
*/

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;
    static List<Student> students = new ArrayList<>();

    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
        students.add(this);
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getStudentID() {
        return studentID;
    }

    public void getDetails() {
        System.out.println("Student Details :");
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Address : " + getAddress());
        System.out.println("ID : " + getStudentID());
    }

    public void enrollInCourse(Course course) {
        if (!coursesEnrolled.contains(course)) {
            coursesEnrolled.add(course);
            course.addStudent(this);
        }
    }

    public void dropCourse(Course course) {
        if (coursesEnrolled.contains(course)) {
            coursesEnrolled.remove(course);
            course.removeStudent(this);
        }
    }

    public void viewEnrolledCourses() {
        System.out.println("Courses enrolled by " + getName() + ":");
        for (int i = 0; i < coursesEnrolled.size(); i++) {
            System.out.println((i + 1) + ".");
            coursesEnrolled.get(i).getDetails();
        }
    }
}
