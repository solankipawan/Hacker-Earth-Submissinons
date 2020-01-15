import java.util.*;
class xor {
    static int find(int x, int y){
        return(x | y) & (~x | ~y);
    }
    public static void main(String[] args) {
        int x =3, y = 5;
        System.out.println("The xor of x and y are " + find(x, y));

    }
}