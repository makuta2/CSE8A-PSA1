/* Filename: Turtle.java 
 * Created by: Nick Lin and Robert Tso, CSE8a
 * Date: October 6, 2016
 */ 

import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle {
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, ModelDisplay modelDisplayer) {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p) {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////
  //put your drawShape method here
      public void drawShape(int size, Color color, int width) {
       setPenWidth(width);
       setPenColor(color);
       int x=size*10;
       forward(x);
       turn(45);
       forward(x);
       turn(45);
       forward(x);
       turn(45);
       forward(x);
       turn(45);
       forward(x);
       turn(45);
       forward(x);
       turn(45);
       forward(x);
       turn(45);
       forward(x);
}
 public void drawStarPointShape(int sizetwo, int sizethree, Color color, int width) {
       setPenWidth(width);
       setPenColor(color);
       int x=sizetwo*10;
       int y=sizethree*45;
       forward(x);
       turn(y);
       forward(x);
       turn(y);
       forward(x);
       turn(y);
       forward(x);
       turn(y);
       forward(x);
       turn(y);
       forward(x);
       turn(y);
       forward(x);
       turn(y);
       forward(x);
}
 public void elaborateShape(Color color, int width) {
       setPenWidth(width);
       setPenColor(color);
       forward(100);
       turn(90);
       forward(50);
       turn(-135);
       forward(71);
       turn(-45);
       forward(100);
       turn(-45);
       forward(71);
       turn(-135);
       forward(50);
       turn(90);
       forward(100);
       turn(-90);
       forward(100);
       
}
}