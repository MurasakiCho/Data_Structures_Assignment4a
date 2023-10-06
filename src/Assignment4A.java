/*
Name: Briana O'Neal
Class: CS 3305/W01
Term: Fall 2022
Instructor: Sharon Perry
Assignment: 4-Part-1-Stacks
*/

//START
import java.util.Scanner;
class Stack{
    //declare variables
    int top_a;
    int top_b;
    int[] stackA;
    int[] stackB;

    //class constructor
    Stack(int[] stackA, int[] stackB){
        this.top_a = -1;
        this.top_b = -1;
        this.stackA = stackA;
        this.stackB = stackB;
    }

    //counter to track top and push into correct index
    public void push_a(int n){
        if(top_a == stackA.length - 1){
            System.out.println("Stack A is full");
        }
        else{
            top_a++;
            stackA[top_a] = n;
            System.out.print("Stack A: ");
            for(int i = 0; i <= top_a; i++){
                System.out.print(stackA[i] + " ");
            }
            System.out.println();
        }
    }
    public void push_b(int n){
        if(top_b == stackB.length - 1){
            System.out.println("Stack B is full");
        }
        else{
            top_b++;
            stackB[top_b] = n;
            System.out.print("Stack B: ");
            for(int i = 0; i <= top_b; i++){
                System.out.print(stackB[i] + " ");
            }
            System.out.println();
        }
    }

    //return top and pop it out (set new top to the index below current one)
    public void pop_a(){
        System.out.println("Popped " + stackA[top_a] + " from Stack A");
        top_a--;
        System.out.print("Stack A: ");
        for(int i = 0; i <= top_a; i++){
            System.out.print(stackA[i] + " ");
        }
        System.out.println();
    }
    public void pop_b(){
        System.out.println("Popped " + stackB[top_b] + " from Stack A");
        top_b--;
        System.out.print("Stack B: ");
        for(int i = 0; i <= top_b; i++){
            System.out.print(stackB[i] + " ");
        }
        System.out.println();
    }

    //array is empty if top = -1
    public boolean is_empty_a(){
        return top_a == -1;
    }
    public boolean is_empty_b(){
        return top_b == -1;
    }

    //shows when both stacks are at capacity
    public boolean is_full(){
        return top_a == (stackA.length - 1) && top_b == (stackB.length - 1);
    }

    //prints the stack
    public void show_a(){
        System.out.print("Stack A: ");
        for (int j : stackA) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public void show_b(){
        System.out.print("Stack B: ");
        for (int j : stackB) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
public class Assignment4A {
    public static void main(String[] args) {
        //declare variables
        Scanner scan = new Scanner(System.in);
        int[] stackA = new int[4];
        int[] stackB = new int[4];
        Stack stack = new Stack(stackA,stackB);

        //user input and stack testing
        while(true){
            //user menu
            System.out.println("What would you like to do?");
            System.out.println("0. Quit");
            System.out.println("1. Push Stack A");
            System.out.println("2. Push Stack B");
            System.out.println("3. Pop Stack A");
            System.out.println("4. Pop Stack B");
            System.out.println("5. Show Stack A");
            System.out.println("6. Show Stack B");
            int userInput = scan.nextInt();

            switch (userInput){
                //exits program
                case 0:
                    System.exit(0);
                    break;
                //checks for full stacks. if not full, calls push_a method
                case 1:
                    if(!stack.is_full()){
                        System.out.println("Enter an integer to push: ");
                        userInput = scan.nextInt();
                        stack.push_a(userInput);
                    }
                    else{
                        System.out.println("All stacks are full");
                    }
                    break;
                //checks for full stacks. if not full, calls push_b method
                case 2:
                    if(!stack.is_full()){
                        System.out.println("Enter an integer to push: ");
                        userInput = scan.nextInt();
                        stack.push_b(userInput);
                    }
                    else{
                        System.out.println("All stacks are full");
                    }
                    break;
                //checks for empty stackA. if not empty, calls pop_a
                case 3:
                    if(!stack.is_empty_a()){
                        stack.pop_a();
                    }
                    else{
                        System.out.println("Stack A is empty");
                    }
                    break;
                //checks for empty stackB. if not empty, calls pop_b
                case 4:
                    if(!stack.is_empty_b()){
                        stack.pop_b();
                    }
                    else{
                        System.out.println("Stack B is empty");
                    }
                    break;
                //shows stackA
                case 5:
                    stack.show_a();
                    break;
                //shows stackB
                case 6:
                    stack.show_b();
                    break;
                //catches wrong integer menu inputs
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}