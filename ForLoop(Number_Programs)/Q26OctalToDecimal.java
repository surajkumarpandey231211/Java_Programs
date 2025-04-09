// WAJP to convert an octal number into decimal number.

import java.util.*;
public class Q26OctalToDecimal {
    public static String OctalToDeci(int num){
        int dec=0, eightMul=1;
        while (num>0) {
            int rem=num%10;
            if(rem>7){
                return "illegal input";
            }
            dec=dec+rem*eightMul;
            eightMul *=8;
          num=num/10;  
        }
        return dec+"";
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int num=sc.nextInt();
        String OctConversion=OctalToDeci(num);
        System.out.println("Decimal form "+"["+num+"] is: "+"["+OctConversion+"]"); 
  }  
}
