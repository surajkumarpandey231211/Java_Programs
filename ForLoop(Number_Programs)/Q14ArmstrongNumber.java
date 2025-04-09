// WAJP to take user input and print whether the number is Armstrong number or not.
import java.util.*;
public class Q14ArmstrongNumber {

    public static boolean isArmstrong(int num){
        int OriginalNum=num;
        int count=getCount(num);
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+getPower(rem, count);
        num=num/10;    
        }
      return sum==OriginalNum;
    }
    public static int getCount(int num){
        int count=0;
        while(num>0){
            count++;
        }
        return count;
    }
    public static int getPower(int a, int b){
        int pow=1;
         for(int i=1; i<=b; i++){
            pow=pow*a;
        }
        return pow;
    }
    public static void main(String[] args) {
        // System.out.println(getPower(2, 3));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(isArmstrong(num));
    }
}
