package Sample;//FACTORY DEMO 
interface Shape {
  void draw();
}

class Circle implements Shape {
  public void draw() {
    System.out.println("Circle");
  }
}

class Rectangle implements Shape {
  public void draw() {
    System.out.println("Rectangle");
  }
}

class Square implements Shape {
  public void draw() {
    System.out.println("Square");
  }
}

class ShapeFactory {
  public Shape getShape(String ShapeType) {
    if (ShapeType == null) {
      return null;
    } else {
      if (ShapeType.equalsIgnoreCase("CIRCLE")) {
        return new Circle();
      } else if (ShapeType.equalsIgnoreCase("RECTANGLE")) {
        return new Rectangle();
      } else if (ShapeType.equalsIgnoreCase("SQUARE")) {
        return new Square();
      }
    }
    return null;
  }
}

public class demo {

  public static void main(String[] args) {
    ShapeFactory ShapeFactory = new ShapeFactory();
    Shape shape1 = ShapeFactory.getShape("Rectangle");
    Rectangle rectangle1 = (Rectangle) shape1;
    rectangle1.draw();
    Shape shape2 = ShapeFactory.getShape("Circle");
    Circle circle2 = (Circle) shape2;
    circle2.draw();
    Shape shape3 = ShapeFactory.getShape("Square");
    Square square3 = (Square) shape3;
    square3.draw();
  }
}

