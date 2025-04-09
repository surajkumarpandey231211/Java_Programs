

import java.util.*;
public class Q18HappyNumber {
    public static int getDigit(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            int sqr=rem*rem;
            sum=sum+sqr;
            num=num/10;
        }
        return sum;
    }
    public static boolean getHappyNum(int num){
        while (num>9) {
            int sum=0;
            while(num>0){
            int rem=num%10;
            int sqr=rem*rem;
            sum=sum+sqr;
            num=num/10;
            }
            num=sum;
            // if(sum==1){
            //     return true;
            // }

        }
        // System.out.println(sum);
        // return sum==1;
        return num==1 || num==7;';lkjhgfd'
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=sc.nextInt();
    System.out.println(getHappyNum(num));
   } 
}
