// 0 0 0 0 0 
//   1 1 1 1 
//     0 0 0 
//       1 1 
//         0 


import java.util.Scanner;

public class Number2 {
    public static void printNumberPattern(int n){
        int star=n; int space=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print((i+1)%2+" ");
            }
            star--; space++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printNumberPattern(n);

    }
    
}

