// WAJP to print and count all the palindrome numbers in a range which is also a prime number.

import java.util.*;
public class Q9SumOfPalindromeIsAlsoPalindrome {
    public static boolean isPalindrome(int num){
            int rev=0;
            int OriginalNum=num;
            while(num>0){
                rev=rev*10+num%10;
            num=num/10;
            }
        return rev==OriginalNum;
    }
    public static int getDigitSum(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
        num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num; i++){
            if(isPalindrome(i) && isPalindrome(getDigitSum(i))){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nCount of palindeome: "+count);
    }
}
