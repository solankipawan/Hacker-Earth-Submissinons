import java.util.*; 
class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = size-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}