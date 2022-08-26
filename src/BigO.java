import java.util.Arrays;

public class BigO {
    int i = 0;
    int n = 5;

    public int lab1(){
        // O(1)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        return 1;
    }
    public int lab2(){
        //O(n)
        int count = 0;
        for (i = 0; i < n; i++) {
            System.out.println(i);
            count++;
        }
        return count;
    }
    public int lab3(){
        //O(n²):
        int count = 0;
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
    public void lab4(){
        //O(logn)
        for (int i = 1; i < n; i = i * 2){
            System.out.println(i);
        }
    }
}
