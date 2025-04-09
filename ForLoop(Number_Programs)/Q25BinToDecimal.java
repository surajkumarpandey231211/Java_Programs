// WAJP to convert a binary number  into decimal number.
// i/p: 101101
// o/p: 45


import java.util.Scanner;
public class Q25BinToDecimal {
    public static String BinToDecimal(String s){
       int dec= 0;
        int twoMultiple=1;
       for(int i=s.length()-1; i>=0; i--){
        char c=s.charAt(i);
        if(c!='0' && c!='1'){
           return "Illegal input"; 
        }
        dec=dec+(c-48)*twoMultiple;
        twoMultiple *=2;
       } 
    return dec+"";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.next();
        String DecimalConversion=BinToDecimal(s);
        System.out.println("Decimal form of "+"["+s+"] is: "+"["+DecimalConversion+"]");
    }
    
}
