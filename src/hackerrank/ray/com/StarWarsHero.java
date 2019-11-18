package hackerrank.ray.com;


public class StarWarsHero implements StarWarsCharacterInterface {

    public String weapon = "light saber";

    public StarWarsHero(){

    }

    @Override
    public void attack() {
        System.out.println("The hero attacks the enemy");
    }
    @Override
    public void heal() {

        System.out.println("The hero heals you");
    }


}
