package FactoryPattern.ShapeExample;

public class ShapeFactory {
    public static Shape createShape(String type){
        if(type.equals("Circle")) return new Circle();
        if(type.equals("Rectangle")) return new Rectangle();
        return null;
    }
}
