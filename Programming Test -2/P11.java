// 11.	An electricity board charges the following rates for the use of electricity: For the first 200 units 80 paisa per unit, For the next 100 units 90 paisa per unit and beyond 300 units Rs 1.00 per unit. All users are charged minimum of Rs.100 as meter charge. If the total amount is more than Rs. 300 then an additional surcharge of 12.36% of total amount is charged. W.A.P. to read the number of units consumed and print out the bill amount.


import java.util.*;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit of Bill :- ");
        double unit = sc.nextDouble();

        double bill = 0;
        if(unit <= 200){
            bill = unit * 0.80;
        }
        else if(unit <= 300){
            bill = 0.80 * 200 + (unit -200) * 0.90;
        }
        else{
            bill = 0.80 * 200 + 0.90 * 100 + (unit - 300) * 1;
        }

        if(unit > 300){
            bill += bill * 0.125;
        }
        System.out.println("The bill amount is : "+bill);
    }
}
