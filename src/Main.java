import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int staffQuantity = sc.nextInt();
        int timeLeaving = sc.nextInt();
        int[] staffFloors = new int[(staffQuantity-1)];
        for (int i = 0; i < staffFloors.length; i++) {
            staffFloors[i] = sc.nextInt();
        }
        int staffLeaving = sc.nextInt();
        int numberStairs = 0;
        for (int i = 0; i < staffFloors.length; i++) {
            numberStairs +=staffFloors[i];

        }


    }
}