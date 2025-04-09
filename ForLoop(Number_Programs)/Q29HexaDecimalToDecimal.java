import java.util.Scanner;

public class Q29HexaDecimalToDecimal {
    public static String HexaDecimalToDecimal(String s){
    int dec=0;
    int sixteenMul=1;
    for(int i=s.length()-1; i>=0; i--){
        char c=s.charAt(i);
        if( c>='0' && c<='9'){//48-57
         dec=dec+(c-48)*sixteenMul;
        }
        else if( c>='A' && c<='F'){//65-70
            dec=dec+(c-55)*sixteenMul;
        }
        else if( c>='a' && c<='f'){//97-102
            dec=dec+(c-87)*sixteenMul;
        }
        else{
            return "illegel value";
        }
        sixteenMul *=16;

    }

return dec+"";
         
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number: ");
        String s=sc.next();
        String HexConversion=HexaDecimalToDecimal(s);
        System.out.println("HexaDecimal form of"+"["+s+"] is: "+"["+HexConversion+"]"); 
    }
    
}
