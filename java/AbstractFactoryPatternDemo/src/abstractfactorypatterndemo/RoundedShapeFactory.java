package abstractfactorypatterndemo;

public class RoundedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType) {
      if(shapeType.equalsIgnoreCase("ROUNDEDRECTANGLE")){
         return new RoundedRectangle();
      } else if(shapeType.equalsIgnoreCase("ROUNDEDSQUARE")){
         return new RoundedSquare();
      } else if(shapeType.equalsIgnoreCase("TRIANGLE")) {
         return new Triangle();
      }
      return null;
   }
}