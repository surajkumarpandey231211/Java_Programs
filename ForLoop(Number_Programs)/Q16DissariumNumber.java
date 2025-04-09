// WAJP to take user input and print whether the number is dissarium number or not.

import java.util.*;
public class Q16DissariumNumber{
    public static int countDigit(int num){
        int count=0;
      while(num>0){
        int rem=num%10;
        count++;
       num=num/10;
      }
     return count;
    }
    public static boolean checkDissariumNum(int num){
       int count=countDigit(num);
       int orgNum=num;
       double sum=0;
       while(num>0){
        int rem=num%10;
         sum=sum+Math.pow(rem,count);
         count--;
         num=num/10;
       }
    return sum==orgNum;
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number: ");
      int num=sc.nextInt();
    //   System.out.println(sumOfDigit(num));
    int count=0;
    for(int i=1; i<num; i++){
        if(checkDissariumNum(i)){
            System.out.print(i+" ");
            count++;
        }
    }
    System.out.println("Count of disserium number is: "+count); 
    }
}