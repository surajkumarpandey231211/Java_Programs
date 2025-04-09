import java.util.*;
public class Q30Permutation {
    public static int getPermutation(int n,int r){
        int purmo=1;
        for(int i=0; i<r; i++){
            purmo=purmo*(n-i);
        }
        return purmo;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter r: ");
        int r=sc.nextInt();
        System.out.println("Purmotation of "+n+" P "+r+" is: "+getPermutation(n, r));
    }
    
}
