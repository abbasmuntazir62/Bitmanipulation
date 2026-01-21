public class Get {
public static void main(String []args){
    //Get manipulation
        int n = 5;
        int pos = 2;
        int bitmasks = 1 << pos;
        if ((bitmasks & n) ==0){
            System.out.print("print zero" );
        }
        else {
            System.out.print("print one");
        }
    }
    
}
