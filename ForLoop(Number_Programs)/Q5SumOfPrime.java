// WAJP to print and count all prime numbers in a range where 
// sum of digits is also prime number.

import java.util.*;
public class Q5SumOfPrime {
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
    for(int i=3; i*i<=num; i=i+2){
        if(num%i==0){
            return false;
        }
    }
    return true;
   } 
   public static int getSumOfDigit(int num){
    int sum=0;
    while(num>0){
        sum=sum+num%10;
       num=num/10;
    }
    return sum;
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=sc.nextInt();
    int count=0;
   for(int i=1; i<=num; i++){
    if(isPrime(i) && isPrime(getSumOfDigit(i))){
            System.out.print(i+" ");
            count++;
    }
   }
   System.out.println("Count of num: "+count);

   }
}
