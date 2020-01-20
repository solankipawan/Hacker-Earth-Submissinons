import java.util.*;
class AddAlt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int[][] arr = new int[3][3];
        //   int k=0;
          for(int i=0;i<arr.length;i++) {
              for(int j=0; j<arr.length;j++){
                  arr[i][j] = sc.nextInt();
              }
          }
          int[] array = new int[50];
          int k=0;
          for(int i=0;i<arr.length;i++) {
            for(int j=0; j<arr.length;j++){
                k = i*3+j;
                array[k] = arr[i][j];
                k++;
            }
        }
        int sum1 =0,sum2=0;
        for(int i=0;i<array.length;i=i+2) {
            sum1 = sum1+array[i];
            sum2 = sum2+array[i+1]; 
        }
        System.out.println(sum1+" " +sum2);
    }
}