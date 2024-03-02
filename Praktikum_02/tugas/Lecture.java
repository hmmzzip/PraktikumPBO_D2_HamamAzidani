/*
Nama : Hamam Azidani
NIM : 24060122130099
Nama file : Titik.java
Deskripsi : File untuk class Lecture
*/

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;
    static List<Lecture> lecturers = new ArrayList<>();

    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
        lecturers.add(this);
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

    public int getEmployeeID() {
        return employeeID;
    }

    public void getDetails() {
        System.out.println("Lecturer Details :");
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Address : " + getAddress());
        System.out.println("ID : " + getEmployeeID());
    }

    public void teachCourse(Course course) {
        if (!coursesTaught.contains(course)) {
            coursesTaught.add(course);
            course.addLecture(this);
        }
    }

    public void viewTaughtCourses() {
        System.out.println("Courses taught by " + getName() + ":");
        for (int i = 0; i < coursesTaught.size(); i++) {
            System.out.println((i + 1) + ".");
            coursesTaught.get(i).getDetails();
        }
    }
}