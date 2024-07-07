import java.util.*;

public class WaterBottle {
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        int ans = numWaterBottles(numBottles, numExchange);
        System.out.println("Total Number of Bottle :- "+ans);
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalBottle = numBottles;

        while(numBottles >= numExchange){
            totalBottle += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }
        return totalBottle;
    }
}
