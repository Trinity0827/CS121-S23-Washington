package week10.BigO;

public class BigODemo {
    public void printOneTime(String string){System.out.println(string);}

    public void printManyTimes(String string){
        for(int i = 1; i <= 100; i++){
            System.out.println(string);
        }
    }

    public void show(int n){ // run n times
        for(int i = 1; i <= n; i++){
            System.out.println("string");
        }
    }

    public void squared(int n){ // run n^2 times
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.println("string");
            }
        }
    }

    public void show2(int n){ // run n^2 + 2n times
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.println("string");
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.println("string");
            System.out.println("string");
        }
    }

    public void show3(int n){ // doesn't change the size of n, it runs in O(1)
        System.out.println("string");
        System.out.println("string");
        System.out.println("string");


    }
}
