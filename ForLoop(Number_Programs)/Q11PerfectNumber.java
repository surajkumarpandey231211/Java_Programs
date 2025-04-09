// WAJP to print and count all the  perfect numbers up to 100.

import java.util.Scanner;
public class Q11PerfectNumber {
    public static boolean isPerfect(int num){
        int sum=0, OriginalNum=num;
        int i=1;
        while (i<=num/2){
            if(num%i==0){
                sum=sum+i;
            }
        i++;
        }
        return sum==OriginalNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=1; i<=num; i++){
            if(isPerfect(i)){
               System.out.print(i+" ");
               count++;
            }
        }
        System.out.println("Count of perfect number in range is: "+count);
    }
}
