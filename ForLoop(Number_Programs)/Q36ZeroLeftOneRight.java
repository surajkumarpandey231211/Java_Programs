// You are given an integer number which contains only 1 or 0.
// WAJP to shift all 0,s to left side and all 1’s to right side and print it.
// i/p: 100111101
// o/p:000111111

import java.util.*;
public class Q36ZeroLeftOneRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        String add="";
        while (num>0) {
            int rem=num%10;
            if(rem==1){
               add=add+rem; 
            }
            if(rem==0){
                add=rem+add;
            }
        num=num/10;
        }
        System.out.println(add);
    }
}
