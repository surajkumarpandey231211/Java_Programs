import java.util.Scanner;
public class OppositTrangle3 {
    public static void oppositTrangle(int n){
        int star=n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
        star--;
        System.out.println();    
        }
    } 
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    oppositTrangle(n);
   }
}
