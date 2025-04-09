import java.util.Scanner;
public class CheckEvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String result=(num%2==0)? num+" is Even" : num+"is Odd";
        System.out.println(result);


    }
}