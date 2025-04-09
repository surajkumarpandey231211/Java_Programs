// WAJP to convert a decimal number  into octal number.
// i/p: 235
// o/p: 353

import java.util.*;
public class Q25DecimalToOctal {
    public static String DecimalToOct(int num){
        String oct="";
         while (num>0) {
            int rem=num%8;
            oct=rem+oct;
          num=num/8;  
         }
         return oct+"";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int num=sc.nextInt();
        String OctConversion=DecimalToOct(num);
        System.out.println("Binary form "+"["+num+"] is: "+"["+OctConversion+"]"); 
    }
}
