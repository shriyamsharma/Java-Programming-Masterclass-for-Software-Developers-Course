package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {

        int a[][] = {
                {1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,0,0},
                {1,0,0,1,1,0,1,1},
                {1,2,2,2,2,0,1,0},
                {1,1,1,2,2,0,1,0},
                {1,1,1,2,2,2,2,0},
                {1,1,1,1,1,2,1,1},
                {1,1,1,1,1,2,2,1}
        };

        System.out.println("Before Color Fill");
        printMatrix(a);
        System.out.println("=====================================");

        System.out.println("After Color Fill");
        floodFill(a, 0,0,3,1);
        printMatrix(a);

    }


    public static void floodFill(int a[][], int r, int c, int toFill, int prevFill){
        int row = a.length;
        int col = a[0].length;

        if(r <0 || r >= row || c < 0 || c >=col){
            return;
        }
        if (a[r][c] != prevFill){
            return;
        }

        a[r][c] = toFill;

        floodFill(a, r-1,c,toFill,prevFill);
        floodFill(a, r+1,c,toFill,prevFill);
        floodFill(a, r,c-1,toFill,prevFill);
        floodFill(a, r,c+1,toFill,prevFill);

    }

    public static void printMatrix(int[][] a){
        for (int[] row : a){
            for (int x : row){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
