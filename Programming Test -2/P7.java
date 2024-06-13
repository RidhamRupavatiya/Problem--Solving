// W.A.P. to print odd numbers that are divisible by 7 but not divisible by 3 between 150 and 445.

public class P7 {
    public static void main(String[] args) {
        for(int i = 150; i<= 445; i++){
            if(i%7 ==0 && i%3 != 0){
                System.out.println(i);
            }
        }
    }
}
