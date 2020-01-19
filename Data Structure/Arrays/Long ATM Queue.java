import java.util.*;
class Atm_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int flag =1;
        int i =1;
            // for(int i =1; i<n; i++)
            while(i<n) {
            if(arr[i-1]<arr[i]) {
                i++;
            }
            else {
                flag +=1;
            }

        }
        System.out.println(flag);
    }
}