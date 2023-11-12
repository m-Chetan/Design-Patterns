package Creational.Builder.Example1;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){

        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        return null;
    }


    private Student createEngineeringStudent(){
        return studentBuilder.setRollno(1).setName("John").setSubjects().build();
    }


}
