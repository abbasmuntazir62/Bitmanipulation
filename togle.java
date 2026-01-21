import java.util.*;
public class togle {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number");;
        int a = sc.nextInt();
        int k =  sc .nextInt();
        int result = toglethbit(a,k);
        System.out.print(result);
    }
static int toglethbit(int n,int k) {
    return n ^ (1 << (k-1));
}
}



        

    

