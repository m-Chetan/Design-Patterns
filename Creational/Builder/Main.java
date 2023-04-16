package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new EngineeringStudentBuilder());
        Student engineerStudent = director.createStudent();
        System.out.println(engineerStudent.toString());

    }
}
