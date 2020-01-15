import java.io.*; 
import java.util.*; 
  
class Micro {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
       int[] arr = new int[size];
        for(int i= 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
       for(int i=0;i<size;i++){
	    int flag=0;
	    for(int j=i+1;j<size;j++){
	        if(arr[i]<arr[j]){
	            flag=0;
	            break;
	        }
	        flag=1;
	    }
	    if(flag==1){
	        System.out.print(arr[i]+" ");
	    }
        }
        System.out.print(arr[size-1]);


    }
}