public class MostRepeatedNumber {
    public static void main(String[] args) {
        int a[] = {2,2,3,2,3,4,4,4,4};
        int ans = mostRepetedNumber(a);
        System.out.println("MostRepeatedNumber: "+ans);
    }
    public static int mostRepetedNumber(int a[]){
        int count2=0;
        int count3=0;
        int count4=0;

        for(int i=0; i<a.length; i++){
            if(a[i]==2){
                count2++;
            }
            else if(a[i]==3){
                count3++;
            }
            else if(a[i]==4){
                count4++;
            }
        }

        int max = count2 > count3 ? (count2>count4 ? count2:count4) : (count3>count4 ? count3:count4);
        return max;
    }
}
