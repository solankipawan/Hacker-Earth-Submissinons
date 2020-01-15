import java.util.Scanner;

class Testcase {

            public static int check(int arr[], int q) {
                int n = arr.length;
                int k =0, start, end = n;
                for(start = 0; start<n; start++) {
                    if(arr[start]> q) {
                        k =1;
                        break;
                    }
                }
                if(k==1) {
                    for(end = n-1 ;end>=start;end--){
                        if(arr[end]>q) {
                            break;
                        }
                }
                int a =end - start;
                System.out.println(a+1);

                
            }
            return 0;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,q;
        p = sc.nextInt();
        q = sc.nextInt();
        int[] arr = new int[p];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            check(arr, q);
    
        
    }


}