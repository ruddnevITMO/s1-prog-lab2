package ru.ruddnev.pokemon;
import ru.ifmo.se.pokemon.*;

import ru.ruddnev.moves.MegaDrain;

public class Roserade extends Roselia {
    public Roserade(String name, int level) {
        super(name, level);

        if (level <= 0) {
            System.out.printf("WARNING! Not supported level! Omitting Pokemon %s\n", name);
            setMod(Stat.HP, 100000000);
        }

        setStats(60, 70, 65, 125, 105, 90);
        setType(Type.POISON, Type.FAIRY);

        addMove(new MegaDrain());
    }
}
