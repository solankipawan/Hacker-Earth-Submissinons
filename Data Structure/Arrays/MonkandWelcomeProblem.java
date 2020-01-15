import java.util.*;
class Monk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int [] A = new int[size];
        int [] B = new int[size];
        for(int i= 0; i<size; i++) {
            A[i] = sc.nextInt();
        }
        for(int i= 0; i<size; i++) {
            B[i] = sc.nextInt();
        }
        int[] C = new int[size];
        for(int i =0;i< size; i++) {
            C[i] = A[i] + B[i];
        }
        for(int i= 0; i<size; i++) {
         System.out.println(C[i]);   
        }
    }
}