import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Hur många små fiender ska skapas?");
        int sea = scn.nextInt();
        for(int i = 0; i <sea; i++){
            SmallEnemy.createSmall();
        }
        System.out.println("Hur många stora fiender ska skapas?");
        int lea = scn.nextInt();
        for(int i = 0; i <lea; i++){
            LargeEnemy.createLarge();
        }

    }
}