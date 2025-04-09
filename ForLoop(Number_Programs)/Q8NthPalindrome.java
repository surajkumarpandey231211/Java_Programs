// WAJP to take user input and print nth palindrome number.

import java.util.Scanner;
public class Q8NthPalindrome {
    public static boolean isPalindrome(int num){
        int rev=0;
        int OriginalNum=num;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev==OriginalNum;
    }
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number: ");
   int num=sc.nextInt();
   int count=0;
    for(int i=1; ; i++){
       if(isPalindrome(i)){
        System.out.print(i+" ");
        count++;
        if(count==num){
            System.out.println(i);
            break;
        }
       }
    } 
    System.out.println("Count of Nth palindrome is: "+count);
   } 
}

