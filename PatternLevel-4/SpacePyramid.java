import java.util.Scanner;
public class SpacePyramid{
    public static void printPattern(int n){
        int star=1; int space=n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*   ");
            }
            star++;
            space--;
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printPattern(n);
        
    }
}