import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 85));
        students.add(new Student(2, "Anu", 91));
        students.add(new Student(3, "Kiran", 78));

        for(Student s : students) {
            s.display();
        }
    }
}
