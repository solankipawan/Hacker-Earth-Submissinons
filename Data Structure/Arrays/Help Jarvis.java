import java.util.*;
class Jarvis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
          
        while(t>=0) {
            String str;
            str = sc.nextLine();
            int size = str.length();
            int[] arr = new int[size];
            for(int i =0; i<size;i++) {
                arr[i] = Character.getNumericValue(str.charAt(i));
            }
                Arrays.sort(arr);
                int j=1;
                while(j<size) {
                    if(arr[j]==arr[j-1]+1){
                    j++;
                    }
                    else{
                    System.out.println("NO");
                    break;
                }

            }
                if(j==size) {
                    System.out.println("YES");
                }

            t--;
        }
    }
}