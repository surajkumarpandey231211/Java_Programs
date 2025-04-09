// WAJP to print and count all the palindrome numbers in a given range.

import java.util.Scanner;
public class Q7PalindromeIngivenRange {
    public static boolean IsPalinrome(int num){
        int rev=0;
        int OriginalNum=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
        num=num/10;
        }
      return rev==OriginalNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=1; i<=num; i++){
            if(IsPalinrome(i)){
                System.out.print(i+" ");
                count++;
            }  
        }
        System.out.println("\n"+count);
    }
    
}

