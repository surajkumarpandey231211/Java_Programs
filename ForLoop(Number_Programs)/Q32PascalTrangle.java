import java.util.*;
public class Q32PascalTrangle {
    public static void getNthRowPascalTrangle(int n){
       
        for(int i=0; i<=n; i++){
            int comb=1;
        for(int j=0; j<i; j++){
            comb=comb*(n-j)/(j+1);
        }
        System.out.print(comb+" ");
    }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        getNthRowPascalTrangle(n);
    }
    
}

