import ru.ifmo.se.pokemon.*;
import ru.ruddnev.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Diancie guardian = new Diancie("Guardian", -41);
        Cottonee destroyer = new Cottonee("Destroyer", -40);
        Whimsicott entendre = new Whimsicott("Entendre", 39);
        Budew starstruck = new Budew("Starstruck", -37);
        Roselia glorious = new Roselia("Glorious", -42);
        Roserade wonderful = new Roserade("Wonderful", 38);

        boolean areAllys = false;
        boolean areFoes = false;

        Pokemon[] Allys = new Pokemon[]{guardian, destroyer, entendre};
        Pokemon[] Foes = new Pokemon[]{starstruck, glorious, wonderful};

        for (int i = 0; i < 3; i++) {
            if (Allys[i].isAlive()) {
                b.addAlly(Allys[i]);
                areAllys = true;
            } else {
                System.out.println("WARNING! Not supported level! Omitting");
            }

            if (Foes[i].isAlive()) {
                b.addFoe(Foes[i]);
                areFoes = true;
            } else {
                System.out.println("WARNING! Not supported level! Omitting");
            }
        }

        if (areFoes && areAllys) {
            b.go();
        } else {
            System.out.println("NO POKEMONS IN BATTLE! GAME WILL NOT START!");
        }
    }
}
