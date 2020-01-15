import java.util.*;
class Micro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        int size, max;
            size = sc.nextInt();
            max = sc.nextInt();
        while(t>0) {
            
            int[] arr = new int[size];
            for(int i =0; i<size; i++) {
                arr[i] = sc.nextInt();
            }
            int res = arr[0];
            for(int i =1;i<size; i++) {
             res = Math.min(res, arr[i]);
            }
            if(res<= max) {
            int time = max-res;
            System.out.println(time);
            }
            else {
                System.out.println(0);
            }
            t--;
        }
    }
}