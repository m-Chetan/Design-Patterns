package Creational.Factory.ToyFactory;

public class ToyFactory {
    

    Toy getToy(String type){
        if(type.equals("Duck")) return new Duck();
        else return new Car();
    }
}
