package week10;

public class RecursionDemo {
    public int calcFactorial(int number){ // 5
        // 5 it's not equal to 5 so do else
        System.out.println(number);
        if(number == 1){
            return 1;
        }

        else{     // 5                             5-1 = 4
            return number * calcFactorial(number - 1);
        }
    }
}

// return 1 stops at the if statement at 1
// return 2 * 1 =  2
// return 3 * 2 =  6
// return 4 * 6 =  24
// return 5 * 24 = 120

// end up with answer be 120.
