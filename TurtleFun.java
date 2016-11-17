/* Filename: TurtleFun.java 
 * Name: Nick Lin, Robert Tso CSE 8a
 * Date: 10/10/16
 */ 
import java.awt.*;

public class TurtleFun {
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) { 
       World w = new World(1000,1000);
      Turtle a = new Turtle(200,500,w);
      Turtle b= new Turtle(600,500,w);
      a.drawShape(10,Color.red,10);
      b.drawShape(10,Color.blue,10);
      Turtle c=b;
      c.penUp();
      c.moveTo(400, 300);
      c.penDown();
      c.drawShape(10,Color.green,10);
    } 
}
