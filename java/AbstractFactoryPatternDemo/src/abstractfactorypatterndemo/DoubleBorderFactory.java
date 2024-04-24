package abstractfactorypatterndemo;

public class DoubleBorderFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType) {
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new DoubleBorderedRectangle();
      } else if(shapeType.equalsIgnoreCase("TRIANGLE")) {
         return new DoubleBorderedTriangle();
      } else if(shapeType.equalsIgnoreCase("ROUNDEDRECTANGLE")) {
         return new DoubleBorderedRoundedRectangle();
      } else if(shapeType.equalsIgnoreCase("ROUNDEDSQUARE")) {
         return new DoubleBorderedRoundedSquare();
      }
      return null;
   }
}