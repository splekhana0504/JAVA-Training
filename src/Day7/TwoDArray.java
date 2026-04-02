package Day7;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i< matrix.length;i++){ //Row
            for(int j=0;j< matrix.length;j++){ //column
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();//changing the line
        }
    }
}
