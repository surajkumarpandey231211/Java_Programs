import java.util.*;
public class Q19HappyNumberInRange {
    public static boolean isPrimeInRange(int num){
           while (num>9){
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
        int count=0;
        for(int i=1; i<=num; i++){
            if(isPrimeInRange(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nCount of happy number is: "+count);
    }     
}
