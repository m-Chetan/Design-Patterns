package Creational.Factory;

public class ShapeFactory {

    public Shape getShape(String input){
        input = input.toLowerCase();

        switch(input){
            case "circle": return new Circle();  
            case "square": return new Square();
            default: return null;
        }

    }
}
