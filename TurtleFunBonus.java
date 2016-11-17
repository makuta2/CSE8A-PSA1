 /* Filename: TurtleFunBones.java
  * Name: Nick Lin, Robert Tso, CSE8a
  * Date: 10/10/16
 */ 
import java.awt.*;

public class TurtleFunBonus {
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) { 
       World w = new World(1000,1000);
      Turtle a = new Turtle(500,500,w);
      Turtle b = new Turtle(500,500,w);
      a.drawStarPointShape(10,1,Color.red,10);
      b.drawStarPointShape(10,-1,Color.blue,10);
      //its a pentadecagon yo
    } 
}
