/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactorypatterndemo;

/**
 *
 * @author HEATON BOB
 */
public class AbstractFactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      shape1.draw();
      
      Shape shape2 = shapeFactory.getShape("SQUARE");
      shape2.draw();
      
      Shape shape3 = shapeFactory.getShape("TRIANGLE");
      shape3.draw();
      
      // Double Border Shape Factory
      AbstractFactory borderFactory = FactoryProducer.getFactory(true);
      
Shape shape4 = borderFactory.getShape("ROUNDEDRECTANGLE");
      shape4.draw();
      
      Shape shape5 = borderFactory.getShape("ROUNDEDRECTANGLE");

      shape5.draw();
      
Shape shape6 = borderFactory.getShape("TRIANGLE");
      shape6.draw();
      
      Shape shape7 = borderFactory.getShape("ROUNDEDSQUARE");
      shape7.draw();
    }
    
}
