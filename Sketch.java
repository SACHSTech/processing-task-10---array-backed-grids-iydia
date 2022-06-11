import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Assignment: 5.12 Processing Task 10 - Array-backed grids
   * Author: Lydia He
   * Due: May 20, 11:59 PM
   * Description: An interactive grid with data contained within a 
   * two-dimenstional array.
   */

  // Variables
  int CELL_WIDTH = 20;
  int CELL_HEIGHT = 20;
  int MARGIN = 5;
  int ROW_COUNT = 10;
  int COLUMN_COUNT = 10;
  int SCREEN_WIDTH = (CELL_WIDTH + MARGIN) * COLUMN_COUNT + MARGIN;
  int SCREEN_HEIGHT = (CELL_WIDTH + MARGIN) * COLUMN_COUNT + MARGIN;

  public void settings() {
    // Size call
    size(SCREEN_WIDTH, SCREEN_HEIGHT);
  }

  public void setup() {
    background(0);
  }

  public void draw() {
    for (int column = 0; column < COLUMN_COUNT; column++) {
      for (int row = 0; row < ROW_COUNT; row++) {
        rect(CELL_WIDTH*column + MARGIN*column, CELL_HEIGHT*row + MARGIN*row, CELL_WIDTH, CELL_HEIGHT);
      }
    }
  }
  
  public void mousePressed(){
    
  }
}
