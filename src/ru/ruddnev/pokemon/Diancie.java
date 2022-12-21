package ru.ruddnev.pokemon;
import ru.ifmo.se.pokemon.*;

import ru.ruddnev.moves.StoneEdge;
import ru.ruddnev.moves.RockPolish;
import ru.ruddnev.moves.Confide;
import ru.ruddnev.moves.PowerGem;

public class Diancie extends Pokemon {
    public Diancie(String name, int level) {
        super(name, level);

        if (level <= 0) {
            System.out.printf("WARNING! Not supported level! Omitting Pokemon %s\n", name);
            setMod(Stat.HP, 100000000);
        }

        setStats(50, 100, 150, 100, 150, 50);
        setType(Type.GRASS, Type.FAIRY);

        setMove(new StoneEdge(), new RockPolish(), new Confide(), new PowerGem());
    }
}
