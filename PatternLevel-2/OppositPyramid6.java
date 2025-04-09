import java.util.*;
public class OppositPyramid6 {
    public static void oppositPyramid(int n){
        int star=2*n-1;
        int space=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            star -=2;
            space++;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        oppositPyramid(n);
    }
}
