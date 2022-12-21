package ru.ruddnev.pokemon;
import ru.ifmo.se.pokemon.*;

import ru.ruddnev.moves.Absorb;

public class Roselia extends Budew {
    public Roselia(String name, int level) {
        super(name, level);

        if (level <= 0) {
            System.out.printf("WARNING! Not supported level! Omitting Pokemon %s\n", name);
            setMod(Stat.HP, 100000000);
        }

        setStats(50, 60, 45, 100, 80, 65);
        setType(Type.POISON, Type.FAIRY);

        addMove(new Absorb());
    }
}
