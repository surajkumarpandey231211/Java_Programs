// * * * * * * * 
//   * * * * * * 
//     * * * * * 
//       * * * * 
//         * * *
//           * *
//             * 
import java.util.Scanner;
public class OppositTrangleSpace4 {
    public static void oppositTrangle(int n){
        int star=n;
        int space=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                System.out.print("* ");
            }
            star--;
            space++;
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
