package adventure_game;

import java.util.Random;

public class Character {

    //CREATES INSTANCE OF RANDOM CLASS

    Random random = new Random();

    //SETS THE HEALTH AND ATTACK DAMAGE

    private final int health = 100;

    private final int attack = random.nextInt(20);


}
