import java.util.Scanner;

/**
 * Created by nazhirjackson on 9/9/16.
 */
public class SumOrProd {
    public void askForChoice() {
        Scanner choice = new Scanner(System.in);
        System.out.println("Hi, would you like to compute sum or product of your number? 1 for sum 2 for product");
        int numchoice = choice.nextInt();
        switch (numchoice) {
            case 1:
                System.out.println(add());
                break;
            case 2:
                System.out.println(product());
            default:
                break;
        }

    }


    public int add() {
        Scanner value = new Scanner(System.in);
        System.out.println("What would your number be? ");
        int numVal = value.nextInt();
        int total = 0;
        for (int i = 1; i <= numVal; i++) {
            total += i;
        }
        return total;

    }
    public int product() {
        Scanner value1 = new Scanner(System.in);
        System.out.println("What would your number be? ");
        int value2 = value1.nextInt();
        int total = 1;
        for (int i = 1; i <= value2; i++) {
            total *= i;
        }
        return total;


    }

    public static void main(String[] args) {
        SumOrProd n = new SumOrProd();
        n.askForChoice();
    }
}
