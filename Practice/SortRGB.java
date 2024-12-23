// Short the Strign into RGB form.

class SortRGB{
    public static void main(String[] args) {
        String str = "ggbbbr";
        StringBuilder r = new StringBuilder();
        StringBuilder g = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'r'){
                r.append(str.charAt(i));
            }else if(str.charAt(i) == 'g'){
                g.append(str.charAt(i));
            }else if(str.charAt(i) == 'b'){
                b.append(str.charAt(i));
            }
        }
        String comString = r.toString() + g.toString() + b.toString();
        System.out.println("String into RGB Form :- " + comString);


        // int countR = 0;
        // int countG = 0;
        // int countB = 0;

        // for (int i = 0; i < str.length(); i++) {
        //     if(str.charAt(i) == 'r'){
        //         countR++;
        //     }
        //     else if(str.charAt(i) == 'g'){
        //         countG++;
        //     }else if(str.charAt(i) == 'b'){
        //         countB++;
        //     }
        // }
        // StringBuilder comb = new StringBuilder();
        // for (int i = 0; i < countR; i++) {
        //     comb.append('r');
        // }
        // for (int j = 0; j < countG; j++) {
        //     comb.append('g');
        // }
        // for (int k = 0; k < countB; k++) {
        //     comb.append('b');
        // }
        // System.out.println("String into RGB Form :- " + comb.toString());
    }
}