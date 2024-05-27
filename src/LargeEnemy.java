public class LargeEnemy extends Enemy {
    protected int xpLevel = 0;
    int hp = 1;
    public static String LargeEnemy;
    public String name = LargeEnemy;
    public LargeEnemy(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public static void createLarge(){
        Enemy lenemy = new Enemy();
        lenemy.hp = 2;
        String name = LargeEnemy;
        Enemies.add(lenemy);


    }

}
