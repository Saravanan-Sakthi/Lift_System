package liftsystem;

import java.util.Scanner;

public class LiftRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your current floor : ");
        int current = scan.nextInt();
        System.out.print("Enter your destination floor : ");
        int dest = scan.nextInt();
        LiftEngine obj = new LiftEngine();
        obj.initialize();
        Character lift = obj.assignLift(current , dest);
        System.out.println(lift);
    }
}
