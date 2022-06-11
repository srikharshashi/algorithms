package BackTracking;

import java.util.Scanner;
import java.util.*;

public class nqueensd {

    int n;

    nqueensd(int n) {
        this.n = n;
    }

    void printBoard(int board[][])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    boolean isSafe(int board[][], int col, int row) {
        //left row check
        for (int i = col; i >= 0; i--) {
            if (board[row][i] == 1)
                return false;
        }

        //upper colum check
        for (int i = row; i >= 0; i--) {
            if(board[i][col]==1)
                return false;
        }

        //lower column check
        for(int i= row;i<n;i++)
        {
            if(board[i][col]==1)
                return false;
        }

        //upper diagonal check
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]==1)
                return false;  
        }

        //lower diagonal check
        for(int i=row,j=col;i<n && j>=0;i++,j--)
        {
            if(board[i][j]==1)
                return false;  
        }

        return true;
    }

    boolean solveNqueens(int board[][],int col) {
        if(n==col)
            return true;
        for(int i=0;i<n;i++)
        {
            if(isSafe(board,col,i))
            {
                board[i][col]=1;
                if(solveNqueens(board,col+1))
                    return true;
                board[i][col]=0;
            }
        }
        return false;
    }


    boolean solveNqueensAll(int board[][],int col) {
        if(n==col)
        {
            printBoard(board);
            return true;
        }
        for(int i=0;i<n;i++)
        {
            if(isSafe(board,col,i))
            {
                board[i][col]=1;
                if(solveNqueens(board,col+1))
                    {
                        
                    }
                board[i][col]=0;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nqueensd obj = new nqueensd(n);
        int board[][] = new int[n][n];
        if(obj.solveNqueens(board, 0))
        {
            System.out.println("Solution exists");
            obj.printBoard(board);
        }
        else
        {
            System.out.println("No soultion exists");
        }

    }
}