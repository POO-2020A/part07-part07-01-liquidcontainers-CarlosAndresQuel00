
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int liquid = 0;
        int liq = 0;
        System.out.println("First: " + liquid + "/100");
        System.out.println("Second: " + liq + "/100");

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (amount > 0) {
                    liquid += amount;
                    if (liquid <= 100) {
                        System.out.println("First: " + liquid + "/100");
                    } else {
                        liquid = 100;
                        System.out.println("First: " + liquid + "/100");
                    }
                    System.out.println("Second: " + liq + "/100");
                } else {
                    System.out.println("First: " + liquid + "/100");
                    System.out.println("Second: " + liq + "/100");
                }
            } else if (command.equals("move")) {
                if (amount > 0 && liquid != 0) {
                    liquid -= amount;
                    if (liquid < 0) {
                        liq = amount + liquid;
                        liquid = 0;
                        System.out.println("First: " + liquid + "/100");
                        System.out.println("Second: " + liq + "/100");
                    } else {
                        System.out.println("First: " + liquid + "/100");
                        liq += amount;
                        if (liq <= 100) {
                            System.out.println("Second: " + liq + "/100");
                        } else {
                            liq = 100;
                            System.out.println("Second: " + liq + "/100");
                        }
                    }
                } else {
                    System.out.println("First: " + liquid + "/100");
                    System.out.println("Second: " + liq + "/100");
                }
            } else if (command.equals("remove")) {
                if (amount > 0) {
                    liq -= amount;
                    if (liq < 0) {
                        liq = 0;
                        System.out.println("First: " + liquid + "/100");
                        System.out.println("Second: " + liq + "/100");
                    } else {
                        System.out.println("First: " + liquid + "/100");
                        System.out.println("Second: " + liq + "/100");
                    }
                } else {
                    System.out.println("First: " + liquid + "/100");
                    System.out.println("Second: " + liq + "/100");
                }
            }

        }
    }
}
