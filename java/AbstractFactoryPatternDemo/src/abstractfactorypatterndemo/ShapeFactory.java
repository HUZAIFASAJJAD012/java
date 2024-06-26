package abstractfactorypatterndemo;

public class ShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType) {
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      } else if(shapeType.equalsIgnoreCase("TRIANGLE")) {
         return new Triangle();
      }
      return null;
   }
}