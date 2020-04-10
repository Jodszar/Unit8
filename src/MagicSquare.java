/**
 * This class determines if the array is a magic square, an arrangement of numbers (usually integers) in a square grid, where the numbers in each row, and in each column, and the numbers in the up and down main diagonals, all add up to the same number.
 * @auther Jodie Azar
 * @Since 4/6/2020
 */
public class MagicSquare {
    private int[][] grid;

    public MagicSquare(int[][] g) {
        grid = g;
    }

    /**
     * This method is supposed to find the sum of the row
     * @param row
     * @return sum of row
     */
    public int rowSum(int row) {
        // <<< Complete the code >>>
        int sum=0;
        for(int col=0; col<grid[row].length; col++){
            sum+= grid[row][col];
        }
        return sum;
    }

    /**
     * This method is supposed to find the sum of the column
     * @param col
     * @return sum of column
     */
    public int colSum(int col) {
        // <<< Complete the code >>>
        int sum=0;
        for(int row=0; row<grid.length; row++){
            sum+= grid[row][col];
        }
        return sum;
    }

    /**
     * This method is supposed to find the sum of the upward diagonal
     * @return sum of upward diagonal
     */
    public int upDiagSum() {
        // <<< Complete the code >>>
        int sum=0;
        int col=0;
        int row= grid.length-1;
        for(int i=0; i<grid.length; i++){
            sum+=grid[row][col];
            row--;
            col++;
        }
        return sum;
    }

    /**
     * This method is supposed to find the sum of the downward diagonal
     * @return sum of downward diagonal
     */
    public int downDiagSum() {
        // <<< Complete the code >>>
        int sum=0;
        for(int i=0; i<grid.length; i++){
            sum+= grid[i][i];
        }
        return sum;
    }

    /**
     * This method is supposed to find the sum of the rows, columns, and diagonals, and to check if they are the same
     * @return check if it's a magic square or not.
     */
    public boolean isMagicSquare() {
        // <<< Complete the code >>>
        int row= grid.length;
        int col= grid[row].length;
        if(rowSum(row)==colSum(col) && colSum(col)== upDiagSum() && upDiagSum()== downDiagSum()){
            return true;
        }
        else{
            return false;
        }
    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}

