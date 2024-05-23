import java.util.*;

public class Gridpath {
    private int[][] grid;

    public Gridpath(int[][] g){
        grid = g;
    }


    public Location getNextLoc(int row, int col) {
        if(row==grid.length-1) {
            col+=1;
        }
        else if(col==grid[0].length-1) {
            row+=1;
        } else {
            if(grid[row][col+1] > grid[row+1][col]) {
                row++;
            } else {
                col++;
            }
        }
        Location loc = new Location(row,col);
        return loc;
    }

    public int sumPath(int row, int col) {
        int sum = grid[row][col];
        Location loc = new Location(row,col);
        while(loc.getRow()!=grid.length-1) {
            
            loc = getNextLoc(row, col);
            row = loc.getRow();
            col = loc.getCol();
            sum+=grid[loc.getRow()][loc.getCol()];
            System.out.println(""+row+" "+col);
        }
        return sum;
        
    }

    public String toString() {
        return Arrays.deepToString(grid);
    }
}
