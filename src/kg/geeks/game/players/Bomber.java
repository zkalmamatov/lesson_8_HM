package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Bomber extends Hero {
    public Bomber(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BANG);
    }

    private boolean bang = false;

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {


        if (!bang && this.getHealth() <= 0) {
            boss.setHealth(boss.getHealth() - 100);
            System.out.println(this.getName() + " bang " + boss.getName() + " on 100-HP");
            bang = true;
        }
    }
}



