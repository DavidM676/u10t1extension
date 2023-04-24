import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many initial bacteria? ");
        int initial = input.nextInt();
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(hours, initial);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(int hour, int initial) {
        if (hour == 0) {
            return initial;
        }
        return numBacteriaAlive(hour-1, initial)+numBacteriaAlive(hour-1, initial)*2;
    }
}
