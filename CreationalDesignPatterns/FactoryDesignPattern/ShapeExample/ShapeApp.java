package CreationalDesignPatterns.FactoryDesignPattern.ShapeExample;

public class ShapeApp {
    public static void main(String[] args) {
        Shape sh = ShapeFactory.createShape("Circle");
        sh.getShape();
        sh = ShapeFactory.createShape("Rectangle");
        sh.getShape();
    }
}
