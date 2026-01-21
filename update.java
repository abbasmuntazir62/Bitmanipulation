
import java.util.*;
public class update {
    public static void main(String[]args) {
        //set
        Scanner sc = new Scanner (System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos; 

        if (oper == 1) {
            
        int newnumber = bitmask | n;

            System.out.println(newnumber);
    } else {
         //clear
          int newbitmask = ~(bitmask);
          int newnumber = newbitmask & n;
          System.out.println(newnumber);

    }
}
}

