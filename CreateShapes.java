/* Filename: CreateShapes.java 
 * Created by: Nick Lin and Robert Tso CSE8a
 * Date: Oct 6, 2016
*/
import java.awt.*;

public class CreateShapes{
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) { 
      World w = new World(1000,1000);
      Turtle a = new Turtle(200,500,w);
      
      a.drawShape(20,Color.red,20);
      Turtle b= new Turtle (250,450,w);
      b.drawShape(15,Color.green,15);
  
      Turtle c=new Turtle(300, 400,w);
      c.drawShape(10,Color.yellow,10);
      Turtle d=new Turtle (350,350,w);
      d.drawShape(5,Color.black,5);
    }
}


