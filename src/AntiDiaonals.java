import com.sun.source.tree.ReturnTree;

import java.util.Scanner;

public class AntiDiaonals{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of rows in the array");
        int sizeRow=scanner.nextInt();

        System.out.println("Enter the number of columns in the array");
        int sizeColumn=scanner.nextInt();

        int array[][]=new int[sizeRow][sizeColumn];

        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<sizeRow;iterator++){
            for(int j=0;j<sizeColumn;j++){
                array[iterator][j]=scanner.nextInt();
            }
        }

        int antiDiagonalMatrix[][]=antiDiagonals(array,sizeRow,sizeColumn);

        int size=sizeRow+sizeColumn-1;

        for(int i=0;i<size;i++){
            for(int j=0;j<sizeColumn;j++){
                System.out.print(antiDiagonalMatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }

    private static int[][] antiDiagonals(int[][] array, int sizeRow, int sizeColumn) {
        int k=0;
        int size=sizeColumn+sizeRow-1;
        int[][] antiDiagonalMatrix=new int[size][sizeColumn];
        for(int x=0;x<sizeColumn;x++){
            int i=0,j=x;
            int l=0;
            while(i<sizeRow && j>=0){
                antiDiagonalMatrix[k][l]=array[i][j];
                j--;
                i++;
                l++;
            }
            k++;
        }
        for(int y=1;y<sizeRow;y++){
            int i=y;
            int j=sizeColumn-1;
            int l=0;
            while(i<sizeRow && j>=0){
                antiDiagonalMatrix[k][l]=array[i][j];
                j--;
                i++;
                l++;
            }
            k++;
        }
        return antiDiagonalMatrix;
    }
}