import java.util.ArrayList;
import java.util.Random;

public class Enemy extends Main {
    public int hp = 0;
    ArrayList<Integer> Xgrid = new ArrayList<Integer>();
    ArrayList<Integer> Ygrid = new ArrayList<Integer>();
    static ArrayList<Enemy> Enemies = new ArrayList<>();


    public static void printArray(){
        System.out.println(Enemies);
    }



}
