import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    private static  final String type = "water";

    private static final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " performed Surf on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " pump off " + enemy.getName() + " With HydroPump! ");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 2 hp");
                enemy.setHp(enemy.getHp() - 2);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hits " + enemy.getName() + " With HydroCanon! ");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 60 hp");
                enemy.setHp(enemy.getHp() - 60);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " performed RainDance on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 55 hp");
                enemy.setHp(enemy.getHp() - 55);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " get a 30 hp boost!");
                enemy.setHp(enemy.getHp() + 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println("Has no effect on  " + enemy.getName());
                enemy.setHp(enemy.getHp());
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public List<String> getAttacks() {
        return attacks;}
}
