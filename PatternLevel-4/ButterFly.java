
// *           * 
// * *       * *
// * * *   * * *
// * * * * * * * 
// * * *   * * * 
// * *       * *
// *           *

import java.util.Scanner;
public class ButterFly {
    public static void printPattern(int n){
        int startStar=1;
        int endStar=n; int mid=n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=startStar || j>=endStar){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            if(i<mid){
                startStar++; endStar--;
            }
            else{
                startStar--; endStar++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printPattern(n);
    }
}
