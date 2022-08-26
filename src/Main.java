import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Queue<String> queue = new Queue<>();
    static Stack<String> stack = new Stack<>();
    static String[] strings;
    
    public static void main(String[] args) throws IOException {
        EnterMessage();
        long start = System.nanoTime();
        TransferMessage();
        StackProcess();
        StackStart();
        long stop = System.nanoTime();
        long time = stop - start;
        System.out.println();
        System.out.println("Took " + time + " ms to send the message");
    }

    public static void EnterMessage() throws IOException{
        System.out.println("Message you want to send:");
        Scanner sc = new Scanner(System.in);
        strings = sc.nextLine().split("\\.");
    }

    public static void TransferMessage(){
        int i = 0;
        try {
            for(i = 0; i < strings.length; i++){
                if(strings[i].length() > 250){
                    throw new IndexOutOfBoundsException();
                } else if (strings[i].equals("")) {
                    throw new IOException();
                }
                queue.enQueue(strings[i] + ".");
                System.out.println("Message sent successful");
            }
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Message length more than 250 characters");
        }
        catch (IOException io){
            System.out.println("Message empty, please type something");
        }
    }
    public static void StackProcess(){
        while (!queue.isEmpty()){
            stack.push(queue.deQueue());
        }
    }
    public static void StackStart(){
        System.out.println("You got new message:");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
