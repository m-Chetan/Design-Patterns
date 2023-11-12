package Creational.Prototype;


//Prototype design pattern is used to clone the object
//Suppose if object is fetching data from database and we want clone of this object
//So we don't want our cloned object to fetch data again from database instead we can use prototype pattern
public class Main {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.loadData();

        Employees empCopy1 = (Employees)employees.clone();
        empCopy1.geList().remove("Chetan");

        Employees empCopy2 = (Employees)employees.clone();
        empCopy2.geList().add("Alex");


        System.out.println(employees.geList());
        System.out.println(empCopy1.geList());
        System.out.println(empCopy2.geList());

    }
}
