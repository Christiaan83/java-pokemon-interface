import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    private static final String type = "fire";

    private static final List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed Inferno on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "trows a PyroBall on "+ enemy.getName());
        switch (enemy.getType()){
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
        }
            case "grass" -> {
            System.out.println(enemy.getName() + " loses 45 hp");
            enemy.setHp(enemy.getHp() - 45);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    public void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "hits "+ enemy.getName() + "with FireLash!");
        switch (enemy.getType()){
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + "hits "+ enemy.getName() + "with FlameThrower!");
        switch (enemy.getType()){
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 200);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
