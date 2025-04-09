// WAJP to convert a decimal number into a hexadecimal number.

import java.util.Scanner;

public class Q28DecimalToHexaDEcimal {
    public static String DecimalToHexaDecimal(int num){
    String hex="";
         while (num>0) {
            int rem=num%16;
            if(rem<=9){
                hex=rem+hex;
            }
            else{
                hex=(char)(rem+55)+hex;
            }
          num=num/16;  
         }
         return hex+"";
    
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int num=sc.nextInt();
        String HexConversion=DecimalToHexaDecimal(num);
        System.out.println("HexaDecimal form of"+"["+num+"] is: "+"["+HexConversion+"]"); 
    }
}
