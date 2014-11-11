import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 15;
    private final int COLS = 20;
    
    // constants for the location of the twelve cells initially alive
    private final int X1 = 1, Y1 = 0;
    private final int X2 = 1, Y2 = 1;
    private final int X3 = 1, Y3 = 2;
    private final int X4 = 5, Y4 = 1;
    private final int X5 = 5, Y5 = 2;
    private final int X6 = 6, Y6 = 1;
    private final int X7 = 6, Y7 = 2;
    private final int X8 = 1, Y8 = 7;
    private final int X9 = 2, Y9 = 7;
    private final int X10 = 2, Y10 = 5;
    private final int X11 = 3, Y11 = 7;
    private final int X12 = 3, Y12 = 6;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife() 
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(X7, Y7);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(X8, Y8);
        grid.put(loc8, rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(X9, Y9);
        grid.put(loc9, rock9);
        
        Rock rock10 = new Rock();
        Location loc10 = new Location(X10, Y10);
        grid.put(loc10, rock10);
        
        Rock rock11 = new Rock();
        Location loc11 = new Location(X11, Y11);
        grid.put(loc11, rock11);
        
        Rock rock12 = new Rock();
        Location loc12 = new Location(X12, Y12);
        grid.put(loc12, rock12);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */

        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        // create a new grid for the next generation
        BoundedGrid<Actor> grid2 = new BoundedGrid<Actor>(ROWS, COLS);
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // Gets the actor of all of the neighbors
                Actor actor = getActor(row,col);
                Actor actorNW = getActor(row-1,col-1);
                Actor actorN = getActor(row-1,col);
                Actor actorNE = getActor(row-1,col+1);
                Actor actorW = getActor(row,col-1);
                Actor actorE = getActor(row,col+1);
                Actor actorSW = getActor(row+1,col-1);
                Actor actorS = getActor(row+1,col);
                Actor actorSE = getActor(row+1,col+1);
                // counts all of the neighbors that are alive (not null)
                int count = 0;
                boolean alive = false;
                if (actorNW != null)
                {
                    count += 1;
                }
                if (actorN != null)
                {
                    count += 1;
                }
                if (actorNE != null)
                {
                    count += 1;
                }
                if (actorW != null)
                {
                    count += 1;
                }
                if (actorE != null)
                {
                    count += 1;
                }
                if (actorSW != null)
                {
                    count += 1;
                }
                if (actorS != null)
                {
                    count += 1;
                }
                if (actorSE != null)
                {
                    count += 1;
                }
                // Determines whether or not the current index should be alive or not
                // based on the current actor and how many of its neighbors are alive
                if (count == 3)
                {
                    alive = true;
                }
                else if (actor != null  && count == 2)
                {
                    alive = true;
                }
                // Adds a rock to the new gird if it will be alive in the next generation
                if (alive == true)
                {
                    Rock rock1 = new Rock();
                    Location loc1 = new Location(row, col);
                    grid2.put(loc1, rock1);
                }
            }
        }
        // Sets the 
        world.setGrid(grid2);

        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.  If the index
     * is out of the grid, null is returned.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        if (row < 0 || col < 0 || row >= ROWS || col >= COLS)
        {
            return null;
        }
         
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class and then runs createNextGeneration ten times.
     * Provides convenient execution.
     * 
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife();

        for (int i = 0;i < 10; i++)
        {
            Thread.sleep(200);
            game.createNextGeneration();
            game.world.show();
        }
    }
    

}
