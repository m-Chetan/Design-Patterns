package Creational.Builder.Example1;

import java.util.List;

public abstract class StudentBuilder {
    int rollno;
    String name;
    List<String> subjects;

    public StudentBuilder setRollno(int rollno) {
        this.rollno = rollno;
        return this;
    }
   
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
  
    public abstract StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
    

}
