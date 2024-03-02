/*
Nama : Hamam Azidani
NIM : 24060122130099
Nama file : Titik.java
Deskripsi : File untuk class Course
*/

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private List<Lecture> lecturer;
    private List<Student> studentsEnrolled;
    static List<Course> courses = new ArrayList<>();

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecturer = new ArrayList<>();
        this.studentsEnrolled = new ArrayList<>();
        courses.add(this);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
    
    public void addLecture(Lecture lecture) {
        if (!lecturer.contains(lecture)) {
            lecturer.add(lecture);
            lecture.teachCourse(this);
        }
    }

    public void addStudent(Student student) {
        if (!studentsEnrolled.contains(student)) {
            studentsEnrolled.add(student);
            student.enrollInCourse(this);
        }
    }

    public void removeStudent(Student student) {
        if (studentsEnrolled.contains(student)) {
            studentsEnrolled.remove(student);
            student.dropCourse(this);
        }
    }

    public void viewLecturers() {
        System.out.println("Lecturers teaching " + getCourseName() + ":");
        for (int i = 0; i < lecturer.size(); i++) {
            System.out.println((i + 1) + ".");
            lecturer.get(i).getDetails();
        }
    }

    public void viewEnrolledStudents() {
        System.out.println("Students enrolled in " + getCourseName() + ":");
        for (int i = 0; i < studentsEnrolled.size(); i++) {
            System.out.println((i + 1) + ".");
            studentsEnrolled.get(i).getDetails();
        }
    }

    public void getDetails() {
        System.out.println("Course Details : ");
        System.out.println("Code : " + getCourseCode());
        System.out.println("Name : " + getCourseName());
        System.out.print("Lecturer : ");
        for (int i = 0; i < lecturer.size(); i++) {
            System.out.print(lecturer.get(i).getName());
            if (i < lecturer.size() - 1) System.out.print(", ");
        }
        System.out.println();  
    }
}