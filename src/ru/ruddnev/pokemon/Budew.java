package ru.ruddnev.pokemon;
import ru.ifmo.se.pokemon.*;

import ru.ruddnev.moves.SludgeBomb;
import ru.ruddnev.moves.EnergyBall;

public class Budew extends Pokemon {
    public Budew(String name, int level) {
        super(name, level);

        if (level <= 0) {
            System.out.printf("WARNING! Not supported level! Omitting Pokemon %s\n", name);
            setMod(Stat.HP, 100000000);
        }

        setStats(40, 30, 35, 50, 70, 55);
        setType(Type.POISON, Type.FAIRY);

        setMove(new SludgeBomb(), new EnergyBall());
    }
}
