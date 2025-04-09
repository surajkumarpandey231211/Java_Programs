import java.util.*;
public class LeftTrangle2 {
    public static void leftTrangle(int n){
        int star=1; int space=n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                System.out.print("* ");
            }
            star++;
            space--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        leftTrangle(n);
        
    }
    
}
