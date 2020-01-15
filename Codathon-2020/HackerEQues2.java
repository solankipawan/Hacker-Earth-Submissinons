import java.util.*;

class Testcase1 { 
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
        int[] array = new int[x];
        for(int i =0; i<x; i++) {
            array[i] = 0;
        }
        int q;
        q = sc.nextInt();

        while(q>0) {
        int n,a,b,c;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(array[a-1] == 0)
        array[a-1] =c;
        else 
        array[a-1] = array[a-1]^c;
        if(b<x) {
            array[b] = array[b]^c;
        }
        int temp =0;
        for(int i =0; i<x;i++) {
            temp = temp^array[i];
            matrix[i][i] = matrix[i][i]^temp;
        }
       
        q--;
            
        }
        int sum=0;
        for(int i=0; i<x; i++) {
            sum = sum+matrix[i][i]; 
        }
        System.out.println(sum);

        

    }
   
}
}

