package Creational.Builder;

import java.util.List;

public class Student {
    int rollno;
    String name;
    List<String> subjects;

    public Student(StudentBuilder builder){
        this.rollno = builder.rollno;
        this.name = builder.name;
        this.subjects = builder.subjects;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", subjects=" + subjects + "]";
    }

    
}
