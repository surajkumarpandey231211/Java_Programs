
import java.util.Scanner;
public class Q1PrimeOfNumber { 
      public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        if(num ==2 || num==3){
            return true;
        }
        if(num%2==0){
            return false;
        }
        for(int i=3; i*i<num; i=i+2){
            if(num%i==0){
               return false;
            }
        }
        return true;
      }

    public static void main(String[] args){        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(isPrime(num));
    } 
}