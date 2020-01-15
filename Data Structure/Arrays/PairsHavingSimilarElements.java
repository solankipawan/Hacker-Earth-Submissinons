import java.util.*;
class Micro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        int arr[] = new int[t];
        for(int i = 0; i<t; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int x=0, y=0;
        for(int i =0; i<t; i++) {
        //     if(arr[i]== arr[i+1]+1 || arr[i+1] == arr[i]+1 ) {
        //         x++;
        //     }
        //     else if(arr[i]== arr[i+1]+1  and arr[i+1] == arr[i]+1 ){
        //         y++;
        //     }
        //     else {
        //         continue;
        //     }
        // }
        System.out.println(arr);
        }

    }
}