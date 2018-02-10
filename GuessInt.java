import java.util.Random;
import java.util.Scanner;

public class GuessInt {
    public static void main(String[] args) {
        int count, c, inp, a, b, met;
        boolean test;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! I'll guess your secret integer from any range!");
        System.out.println("Tell me your range - from a to b.");
        System.out.print("The left border of range (a) is:");
        a = sc.nextInt();
        System.out.print("And the right border of range (b) is:");
        b = sc.nextInt();
        System.out.print("OK! Choose the guessing method: 1 - random search; 2 - bisection:");
        met = sc.nextInt();
        System.out.println("If I guess your number - input 0; ");
        System.out.println("if your number ir less than mine - input -1;");
        System.out.println("if your number ir greater than mine - input 1.");
        Random rnd = new Random();
        count=0;
        do {
            if (count == 0) {
                c = a;
            } else {
                if (count == 1) {
                    c = b;
                } else {
                    if (met == 1) {
                        c = rnd.nextInt(b - a + 1) + a;
                    } else {
                        c = (a + b) / 2;
                    }
                }
            }
            test=true;
            do {
                System.out.println("Is your number " + c + "?");
                System.out.print("Enter your answer (0 for yes, 1 for greater, -1 for less:");
                inp = sc.nextInt();
                if (count > 1) {
                    if (inp == 1) {
                        a = c;
                     } else {
                        if (inp == -1) {
                            b = c;
                         }
                    }
                }
                if (inp == 0 | inp == 1 | inp == -1){test=false;}
            } while (test);
            count=count+1;
        } while (inp != 0);
        System.out.println("I did it!!! :) Your number is "+c+"!");
        System.out.println("Written by ShennaR.");
        sc.close();
    }
}

