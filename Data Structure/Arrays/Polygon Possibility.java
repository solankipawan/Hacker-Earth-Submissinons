import java.util.*;
class Polygon {
     static boolean check(int arr[], int n) {
        int sum = 0, maxS = 0; 
		for (int i = 0; i < n; i++) { 
			sum += arr[i]; 
			maxS = Math.max(arr[i], maxS); 
		} 
        if ((sum - maxS) > maxS) 
			return true; 

		return false; 
	} 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t>0) {
            int size;
            size = sc.nextInt();
            int arr[] = new int[size];
            for(int i = 0; i<size;i++) {
                arr[i] =sc.nextInt();

            }
            int n = arr.length;
            // check(arr, n);
            if (check(arr, n)) 
			System.out.println("Yes"); 
		else
			System.out.print("No"); 
            t--;
        }
    }
}