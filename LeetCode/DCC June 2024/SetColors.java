class Solution {
    public void sortColors(int[] nums) {
        // for Count a numbers 
        int zeroCnt = 0, oneCnt = 0, twoCnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCnt++;
            }else if(nums[i] == 1){
                oneCnt++;
            }else{
                twoCnt++;
            }
        }

        // initialize array iterator
        int arrayIterator = 0;

        // Place All 0s into arrayIterator
        for(int i = 0; i < zeroCnt; i++){
            nums[arrayIterator] = 0;
            arrayIterator++;
        }

        // Place All 1s into arrayIterator
        for(int i = 0; i < oneCnt; i++){
            nums[arrayIterator] = 1;
            arrayIterator++;
        }

        // Place All 2s into arrayIterator
        for(int i = 0; i < twoCnt; i++){
            nums[arrayIterator] = 2;
            arrayIterator++;
        }
    }
}