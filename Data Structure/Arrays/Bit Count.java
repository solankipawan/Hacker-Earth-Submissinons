import java.util.*;
class BitCounting {

	public static void countBits(int n){
    int count =0;
		while(n!=0) {
    int reminder = n%2;
    if(reminder==1) {
      count+=1;
    }
    n = n/2;
    }
    System.out.println(count);
   
	}
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n;
  n =sc.nextInt();
    countBits(n);
//   System.out.println(count);
  }
	
}