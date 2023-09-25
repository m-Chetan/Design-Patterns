package Creational.Factory.ShapeFactory;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("square");
        
        shape.draw();
    }
}
