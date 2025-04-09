
import java.util.Scanner;
public class Q2PrimeInRange {
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        if(num==3 || num==3){
            return true;
        }
        if(num%2==0){
            return false;
        }
        for(int i=3; i*i<num; i=i+2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the min number: ");
        int min=sc.nextInt();
        System.out.print("Enter the max number: ");
        int max=sc.nextInt();
        int count=0;
        for(int i=min; i<=max; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nCount of prime num: "+count);
    }
    
}
