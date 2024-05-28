package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

import java.util.Random;

public class Hacker extends Hero {
    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.TAKE_HP);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        int luckyIndex = RPG_Game.random.nextInt(heroes.length);

        if (RPG_Game.getRoundNumber() %2 == 0 && this.getHealth() > 0){
            heroes[luckyIndex].setHealth(heroes[luckyIndex].getHealth() +10);
            boss.setHealth(boss.getHealth() -10);
            System.out.println("Hacker took 10-HP from BOSS and take " + heroes[luckyIndex].getName());
        }
    }
}
