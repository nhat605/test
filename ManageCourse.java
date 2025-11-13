package controller;

import model.Course;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageCourse {
    public ManageCourse() {
        instantiate(); // gọi hàm tạo dữ liệu mẫu
    }
    private ArrayList<Course> courseArrayList = new ArrayList<>();

    User instructor = new User();
    Scanner sc = new Scanner(System.in);

    public void createCourse() {
        System.out.print("Enter Course ID: ");
        String courseId = sc.nextLine();
        System.out.print("Enter Course name: ");
        String courseName = sc.nextLine();
        Course course = new Course(courseId, courseName, instructor);
        courseArrayList.add(course);
    }

    public void displayCourses() {
        for (Course c : courseArrayList) {
            System.out.println(c.getCourseId() + "-" + c.getCourseName() + "-" + c.getStudentList());
        }
    }

    public void updateCourse() {
        boolean found = false;
        System.out.print("Enter Course ID to update: ");
        String id = sc.nextLine();
        for (Course c : courseArrayList) {
            if (c.getCourseId().equals(id)) {
                System.out.println("Course found: " + c.getCourseId() + "-" + c.getCourseName());
                System.out.print("Enter new Course Id: ");
                String newId = sc.nextLine();
                System.out.print("Enter new Course Name: ");
                String newName = sc.nextLine();
                c.setCourseId(newId);
                c.setCourseName(newName);
                System.out.println("Update successful.");
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("No course exist with id " + id);
        }
    }

    public void deleteCourse() {
        System.out.print("Enter Course ID to delete: ");
        String id = sc.nextLine();
        boolean removed = courseArrayList.removeIf(c ->(c.getCourseId().equals(id)));
        if (removed) {
            System.out.println("Delete successful");
        } else
            System.out.println("No Course found with id" + id);
    }
    private void instantiate() {
        courseArrayList.add(new Course("A01", "name1", ));
    }
}

