package hackerrank.ray.com;


public class EnemyStarWars implements StarWarsCharacterInterface{

    public String weapon = "Gun";
    public EnemyStarWars(){

    }

    @Override
    public void attack() {
        System.out.println("The enemy attacks!");
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals!");
    }

    public void weaponDraw() {

        System.out.println("The enemy draws his weapon!");
    }



}
