import java.util.*;
public class Q18HappyNumber2 {
    public static boolean isHappyNumber(int num){
        while(num>9){
            int sum=0;
            while(num>0){
                int rem=num%10;
                sum=sum+rem*rem;
             num=num/10;   
            }
        num=sum;    
        }
        return num==1 || num==7;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(isHappyNumber(num));
    }
}
