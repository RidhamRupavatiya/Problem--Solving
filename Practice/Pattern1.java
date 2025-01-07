// 1 2 3 4 5 6
//  2 3 4 5 6
//   3 4 5 6 
//    4 5 6
//     5 6
//      6

public class Pattern1 {
    public static void main(String[] args) {
        int n = 6;
        int num;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            num = n - i + 1;
            for(int k=i; k>=1; k--){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}