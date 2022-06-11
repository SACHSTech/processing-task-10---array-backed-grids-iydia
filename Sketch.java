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
  int column;
  int row;
  // Array Variables
  int[][] intGrid;

  public void settings() {
    // Size call
    size(SCREEN_WIDTH, SCREEN_HEIGHT);
  }

  public void setup() {
    background(0);
    intGrid = new int[10][10];
  }

  public void draw() {
    intGrid[1][5] = 1;
    for (column = 0; column < COLUMN_COUNT; column++) {
      for (row = 0; row < ROW_COUNT; row++) {
        // Draws a green retangle when the value of intGrid[row][column]is equal to 1
        if(intGrid[row][column] == 1){
          fill(0, 255, 0);
            rect(CELL_WIDTH*column + MARGIN*column, 
            CELL_HEIGHT*row + MARGIN*row, 
            CELL_WIDTH, CELL_HEIGHT);
        // Otherwise, draw a white rectangle
        } else {
          fill(255);
            rect(CELL_WIDTH*column + MARGIN*column, 
            CELL_HEIGHT*row + MARGIN*row, 
            CELL_WIDTH, CELL_HEIGHT);
        }
      }
    }
  }
  
  public void mousePressed(){
    System.out.println("click");
    for (column = 0; column < COLUMN_COUNT; column++) {
      for (row = 0; row < ROW_COUNT; row++) {
        if (dist(MARGIN * (column + 1) + (column * CELL_WIDTH) + ROW_COUNT, MARGIN * (row + 1) + (row * CELL_HEIGHT) + COLUMN_COUNT, mouseX, mouseY) < COLUMN_COUNT ) {
          System.out.println("mouse coordinates: (" + mouseX + ", " + mouseY + "); grid coordinates: (row:" + row + ", column:" + column + ")");
          intGrid[row][column] = 1;
        }
      }
    }
  }
}
