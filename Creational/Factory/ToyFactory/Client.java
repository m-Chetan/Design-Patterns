package Creational.Factory.ToyFactory;

public class Client {
    
    public static void main(String[] args) {
        ToyFactory toyFactory = new ToyFactory();

        Toy toy = toyFactory.getToy("Car");

        toy.createToy();
    }
}
