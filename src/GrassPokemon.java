import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    private static final String type = "grass";

    private static final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hits " + enemy.getName() + "with LeafStorm!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hits " + enemy.getName() + " with SolarBeam!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp" );
                enemy.setHp(enemy.getHp() - 20);

            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);

            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);

            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);

            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " performed LeechSeed on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp. "+ name.getName() + " Wins 30 hp!");
                enemy.setHp(enemy.getHp() - 30);
                name.setHp(name.getHp() + 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp. " + name.getName() + " Wins 10 hp!");
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 25 hp. " + name.getName() + " Wins 25 hp!");
                enemy.setHp(enemy.getHp() - 25);
                name.setHp(name.getHp() + 25);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp. " + name.getName() + " Wins 50 hp!");
                enemy.setHp(enemy.getHp() - 50);
                name.setHp(name.getHp() + 50);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hits " + enemy.getName() + " with LeaveBlade!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 55 hp");
                enemy.setHp(enemy.getHp() - 55);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public List<String> getAttacks() {
        return attacks;}
}
