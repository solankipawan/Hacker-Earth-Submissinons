import java.util.*;

class Testcase1 { 
 static int[][] findxor(int[][] matrix, int x,int n, int a, int b, int c) {
        if(n==1) {
            for(int i=a-1; i<b;i++) {
                for(int j = 0; j<x;j++) {
                    matrix[i][j] = matrix[i][j]^c;
                }
            }
        }
        else if (n==2) {
            for(int i=0; i<x;i++) {
                for(int j =a-1; j<b; j++) {
                    matrix[i][j] = matrix[i][j]^c;
                }
              }   

        }
        return matrix;
    }
    static int sumOfDiagonal(int[][] matrix, int x) {
        int sum= 0;
        for(int i =0; i<x; i++) {
                    sum += matrix[i][i];
            }
        return sum;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); {
        int x;
        x = sc.nextInt();
        int[][] matrix = new int[x][x];
        for(int i =0 ; i<x; i++) {
            for(int j = 0; j<x; j++) {
                matrix[i][j] = sc.nextInt(); 
            }
        }
        int q;
        q = sc.nextInt();
        while(q>0) {
            int n,a,b,c;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        findxor(matrix, x, n, a, b, c);

            q--;
        }
                System.out.println( sumOfDiagonal(matrix, x));



    }
   
}
}