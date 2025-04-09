import java.util.*;
public class Q12StrongNumber {
    public static boolean isStrong(int num){
        if(num==factOfDigit(num)){
            return true;
        }
     return false;
    }
    public static int factOfDigit(int num){
            int sum=0;
            int fact1;
            while(num>0){
                int rem=num%10;
                fact1=getFactorial(rem);
                sum=sum+fact1;
            num=num/10;
            }
        return sum;
    }
    public static int getFactorial(int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(isStrong(num));
    }
}
