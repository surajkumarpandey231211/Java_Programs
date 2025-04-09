// WAJP to take an integer input and replace all 0’s by 1 in a number.		[Amazon]
// i/p: 41022005;
// o/p: 41122115


import java.util.*;
public class Q39ZeroReplaceByOne {
    public static String zeroReplaceByOne(int num){
        String add="";
        while (num>0) {
            int rem=num%10;
            if(rem==0){
              add=1+add;
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
        System.out.println(zeroReplaceByOne(num));
    }
}
