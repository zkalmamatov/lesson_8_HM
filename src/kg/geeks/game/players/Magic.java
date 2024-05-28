package kg.geeks.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + 5);
            System.out.println("Magic up damage for " + heroes[i].getName() + " to " + heroes[i].getDamage());


        }


    }
}
