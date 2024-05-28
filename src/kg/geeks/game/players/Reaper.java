package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Reaper extends Hero {
    public Reaper(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.DAMAGE_UP);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        if (this.getHealth() <= ((this.getHealth() * 1.3) - this.getHealth()) && this.getHealth() > 0) {
            this.setDamage(this.getDamage() * 2);
            System.out.println(this.getName() + " HP low 30% " + " damage up to" + this.getDamage());
        }
        if (this.getHealth() <= ((this.getHealth() * 1.15) - this.getHealth()) && this.getHealth() > 0) {
            this.setDamage(this.getDamage() * 3);
            System.out.println(this.getName() + " HP low 15% " + " damage up to" + this.getDamage());
        }


    }
}
