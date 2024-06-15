class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        // first sort the array 
        Arrays.sort(seats);
        Arrays.sort(students);

        // intitilize move by 0
        int move = 0;

        // loop
        for(int i = 0; i < seats.length; i++){
            if(seats[i] == students[i]){
                move += 0;
            } else if(seats[i] > students[i]){
                move += seats[i] - students[i];
            } else{
                move += students[i] - seats[i];
            }
        }
        return move;
    }
}