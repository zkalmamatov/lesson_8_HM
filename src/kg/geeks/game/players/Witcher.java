package kg.geeks.game.players;

public class Witcher extends Hero {


    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.RESURRECT);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0 && this.getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() + this.getHealth());
                this.setHealth(0);
                System.out.println("Witcher resurrect " + heroes[i].getName());
            }
        }
    }
}
