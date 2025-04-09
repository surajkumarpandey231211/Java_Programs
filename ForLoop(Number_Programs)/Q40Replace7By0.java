// WAJP to take an integer input and replace all 7’s by 0 in a number.		[Amazon]
// i/p: 41072707;
// o/p: 41002000

import java.util.*;
public class Q40Replace7By0 {
    public static String sevenReplaceByZero(int num){
        String add="";
        while (num>0) {
            int rem=num%10;
            if(rem==7){
                add=0+add;
            }
            else{
                add=rem+add;
            }
           num=num/10; 
        }
        return add;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(sevenReplaceByZero(num));
    }
}
