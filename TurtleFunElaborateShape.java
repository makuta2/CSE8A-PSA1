 /* Filename:TurtleFunElaborateShape.java
  * Name: Nick Lin, Robert Tso, CSE8a
  * Date: 10/10/16
 */ 
import java.awt.*;
//t-shirt
public class TurtleFunElaborateShape {
    public static void main (String[] args) { 
       World w = new World(1000,1000);
      Turtle a = new Turtle(500,500,w);
      a.elaborateShape(Color.blue, 3);
    } 
}