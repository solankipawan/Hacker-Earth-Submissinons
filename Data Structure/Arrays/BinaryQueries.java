import java.util.*; 
class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[p];
        for(int i =0; i<p; i++){
            arr[i]= sc.nextInt();
        }
        while(q>0) {
            int a = sc.nextInt();
            if(a==0) {
                int l =sc.nextInt();
                int r= sc.nextInt();
                if(arr[r-1]==1) {
                    System.out.println("ODD");
                }
                else {
                    System.out.println("EVEN");
                }

            }
            else if(a==1) {
                int x = sc.nextInt();
                if(arr[x]==1) {
                    arr[x] =0;
                }
                else {
                    arr[x] = 1;
                }

            }



            q--;
        }





    }
}