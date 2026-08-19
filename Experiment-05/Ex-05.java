import java.util.Scanner;

class Stack {
    int size;
    int top;
    int[] stack;

    Stack(int size) {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    void push(int item) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = item;
            System.out.println(item + " pushed into stack");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");

            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

public class five {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack s = new Stack(size);

        while (true) {

            System.out.println("\n1. Push");
            System.out.println("2. Display");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    int item = sc.nextInt();
                    s.push(item);
                    break;

                case 2:
                    s.display();
                    break;

                case 3:
                    System.out.println("Program termination");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
