import java.util.*;
class Micro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i =0; i<m;i++) {
            for(int j =0; j<n;j++){
                arr[i][j] = sc.nextInt();

            }
        }
        int[][] B = new int[n][m];
        int i, j; 
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) { 
                B[i][j] = arr[j][i]; 
    }
} 
        for (i = 0; i < n; i++) 
        {     
             System.out.print("\n"); 

            for (j = 0; j < m; j++)  {
            System.out.print(B[i][j] + " "); 
            // System.out.print("\n"); 
        } 
    }      
        
    }
}