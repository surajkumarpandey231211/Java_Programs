// AJP to print  all the  alternate Prime numbers up to a given range.
// o/p:
// 2 5 11 17….
// Or
// 3 7 13 19

import java.util.*;
public class Q4AlternativePrimeNumber {
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int count=0;
       for(int i=2; i<=num; i++){
        if(isPrime(i)){
             count++;
            // if(count%2==0){
            //     System.out.print(i+" ");
            // }

            if(count%2==1){
                System.out.print(i+" ");
            }
        }
       }
    }
}
