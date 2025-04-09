// WAJP to take user input and check the number is palindrome or not.
import java.util.Scanner;
public class Q6IsPalinrome {
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
        if(IsPalinrome(num)){
            System.out.println("palindrome...");
        }
        else{
            System.out.println("Not a palindrome...");
        }
    }
    
}
