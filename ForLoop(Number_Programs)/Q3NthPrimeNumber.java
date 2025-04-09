import java.util.Scanner;
public class Q3NthPrimeNumber {
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        if(num==2 || num==3){
            return true;
        }
        if(num%2==0){
            return false;
        }
        for(int i=3; i*i<=num; i=i+2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=2; ;i++){
            if(isPrime(i)){
                count++;
                if(count==num){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
