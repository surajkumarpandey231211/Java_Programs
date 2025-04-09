// You are given an integer number. WAJP to shift all even digits to left side and all odd digits to right side and print it.
// Input:
// N=253687
// Output
// 268537

import java.util.*;
public class Q37EvenLeftOddRight {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number: ");
       int num=sc.nextInt();
       String add="";
       while (num>0){
        int rem=num%10;
        if(rem%2==0){
            add=rem+add;
        }
        if(rem%2==1){
            add=add+rem;
        }
        num=num/10;
       } 
       System.out.println("Even Left Odd Right side: "+add);
    }
}
