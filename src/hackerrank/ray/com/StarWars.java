package hackerrank.ray.com;

import java.util.Random;

public class StarWars {

    public static StarWarsCharacterInterface summonCharacter() {

        Random rand = new Random();

        if (Math.abs(rand.nextInt()) % 2 == 0 ){
            return new EnemyStarWars();
        }
        else{
            return new StarWarsHero();
        }
    }


    public static void main(String[] args) {

        EnemyStarWars darthVader = new EnemyStarWars();
        StarWarsHero luke = new StarWarsHero();
        darthVader.attack();
        luke.attack();
        darthVader.heal();
        System.out.println(darthVader.weapon);

    }
}




