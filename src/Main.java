import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Recursion = the process in which a method calls itself continuously
        //Useful for factorials, transversing trees, and simplifying complex tasks

        Scanner scan = new Scanner(System.in);
        System.out.println("How far do you want to walk?");
        int distance = scan.nextInt();

        //Method for step starting at zero
        takeAStep(0,distance);
    }
//Method outside the main method
    static void takeAStep(int i, int distance){
        //Base Case
        if(i<distance) {
            //increment the counter by one
            i++;

            //text and the index
            System.out.println("You took a step: " +i + "meter/s");

            //call method, counter, and the distance
            takeAStep(i, distance);
        } else{
            System.out.println("You reach the finish line!");
        }
    }
}