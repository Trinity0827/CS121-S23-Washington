package Activity10.bigOActivity;

import week10.BigO.BigOExamples;

public class Test {
    public static void main (String [] args) {


        //O(1)
        BigO plan = new BigO();
        plan.printOnce();


        //O(n)
        plan.printNTimes(plan.character);
        plan.printNTimes(plan.spongeBobCharacters);
        plan.printNTimes(plan.ages);

        //O(n^2)
        plan.printNSquaredTimes(plan.spongeBobCharacters);
        plan.printNSquaredTimes(plan.ages);
    }
}
