public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory1 = ShapeFactory.getInstance();
        Shape shape1 = shapeFactory1.getShape("SQUARE");
        shape1.draw();
        Shape shape2 = shapeFactory1.getShape("RECTANGLE");
        shape2.draw();
        
        System.out.println("hashcode of shape1: " + shapeFactory1.hashCode());
        System.out.println("hashcode of shape2: " + shapeFactory1.hashCode());
    }
}
