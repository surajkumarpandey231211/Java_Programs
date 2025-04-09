// You are given an integer number. WAJP to shift all 0 to left side and all other digits to right side while maintaining the order of the number.
// Input:
// N=2030680
// Output
// 0002368
import java.util.*;
public class Q38ZeroLeftOtherRight {
    public static String zeroLetfOtherRight(int num){
       String add="";
       while (num>0) {
        int rem=num%10;
        if(rem==0){
            add=rem+add;
        }
        else{
            add=add+rem;
        }
        num=num/10;
       }
       return add;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=sc.nextInt();
    System.out.println(zeroLetfOtherRight(num));
   } 
}
