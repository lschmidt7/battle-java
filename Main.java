public class Main {
    
    public static void main(String[] args) {
        Hero hero = new Hero(20, 100);
        Enemy enemy = new Enemy(20, 100);

        int turn = 0;

        while(hero.getEnergy() > 0 && enemy.getEnergy() > 0)
        {
            if(turn % 2 == 0)
            {
                float damage = hero.attack();
                enemy.defend(damage);
            }
            else
            {
                float damage = enemy.attack();
                hero.defend(damage);
            }
            turn++;
        }
        if(hero.getEnergy()<=0)
        {
            System.out.println("Enemy Win");
        }
        else
        {
            System.out.println("Hero Win");
        }
    }

}
