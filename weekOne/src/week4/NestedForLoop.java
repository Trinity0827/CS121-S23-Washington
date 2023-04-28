package week4;
import java.util.concurrent.TimeUnit;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("outerLoop = %d innterLopp = %d\n", i, j);
            }
        }
    }
}
