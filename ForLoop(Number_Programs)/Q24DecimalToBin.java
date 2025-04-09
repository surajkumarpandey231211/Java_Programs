// WAJP to convert a decimal number into binary number.
// Eg:
// i/p: 28
// o/p: 11101


import java.util.Scanner;
public class Q24DecimalToBin{
    public static String DecimalToBinary(int num){
        String bin="";
        while(num>0){
            int rem=num%2;
            bin=rem+bin;
        num=num/2;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Decimel number: ");
        int num=sc.nextInt();
        String binConversion=DecimalToBinary(num);
        System.out.println("Binary form "+"["+num+"] is: "+"["+binConversion+"]");
    }
}