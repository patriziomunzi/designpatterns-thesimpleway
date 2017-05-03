package hcom.hpay.pattern.behavioral.observer.right;

import java.util.Scanner;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Client {

    public static void main(String[] args) {
        Subject sub = new Subject();

        new HexObserver(sub);
        new BinObserver(sub);

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}
