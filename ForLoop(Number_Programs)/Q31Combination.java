import java.util.*;
public class Q31Combination {
    public static int getCombination(int n,int r){
        int comb=1;
        for(int i=0; i<r; i++){
            comb=comb*(n-i)/(i+1);
        }
        return comb;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter r: ");
        int r=sc.nextInt();
        System.out.println("Purmotation of "+n+" C "+r+" is: "+getCombination(n, r));
    }
    
}

