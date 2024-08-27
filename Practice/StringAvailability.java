// Check whether string contains sub string, without using the java predefined methods

class StringAvailability{
    public static void main(String[] args) {
        StringAvailability sa = new StringAvailability();
        String st = "darshan is an university. the university is so wared.";
        String sub = "university";
        sa.checkAvailability(st, sub);
    }
    public void checkAvailability(String st, String sub){
        int len = st.length();
        int subLen = sub.length();
        int count = 0;
        boolean available = false;
        for (int i = 0; i <= len-subLen; i++) {
            int j;
            for (j = 0; j < subLen; j++) {
                if(st.charAt(i+j) != sub.charAt(j)){
                    break;
                }     
            }
            if(j == subLen){
                count++;
                available = true;
            }
        }
        if (available) {
            System.out.println("The substring \""+ sub +"\" is available " + count + " times");
        } else {
            System.out.println("The substring is not available");
        }
    }
}