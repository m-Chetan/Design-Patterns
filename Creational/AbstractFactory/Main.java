package Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = ComputerFactory.getComputer(new PCFactory("8GB","500GB","AMD")); 
        System.out.println("PC: " + computer1);

         Computer computer2 = ComputerFactory.getComputer(new ServerFactory("32GB","5TB","Intel")); 
        System.out.println("Server: " + computer2);
    
    }
}
