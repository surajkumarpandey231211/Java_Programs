import java.util.*;
public class Trangle1{
    public static void starRightTrangle(int n){
        int star=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            star++;
        System.out.println();
        } 
    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        starRightTrangle(n);
    }
}