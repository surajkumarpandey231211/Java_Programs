import java.util.*;
public class Q20AutomorphicNumber {
    public static boolean isAutomorphic(int num){

        int newNum=num*num;
        int rem=newNum%100;
        if(rem==num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num =sc.nextInt();
        System.out.println(isAutomorphic(num));;lkjhgfdsa
    }
}
