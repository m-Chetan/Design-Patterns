package Creational.Factory.ToyFactory;

public class Duck implements Toy{
    @Override
    public void createToy(){
        System.out.println("Duck Toy is created");
    }
}
