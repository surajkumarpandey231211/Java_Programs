// Circular Prime Check:
// A Circular Prime is a prime number that remains prime even after rotating its digits.
// Example: 197 → 971 → 719 (All are prime).
// Write a Java program to check if a number is a Circular Prime or not.

import java.util.*;
public class Q41CircularPrime {
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        if(num==2 || num==3){
            return true;
        }
        if(num%2==0){
            return false;
        }
        for(int i=3; i*i<=num; i=i+2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean circularPrime(int num){
        int sum;
        int remD=num%10;
        int remD1=num/10;
        while(num>0){
            // int rem=num%10;
            sum=remD+remD1;
            if(isPrime(sum)){lkjhgfds
                return true;
            }
        num=num/10;
        }
    return false;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number: "); 
       int num=sc.nextInt();
       System.out.println(circularPrime(num));
    }
}
