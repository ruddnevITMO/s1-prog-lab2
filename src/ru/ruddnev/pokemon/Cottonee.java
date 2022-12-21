package ru.ruddnev.pokemon;
import ru.ifmo.se.pokemon.*;

import ru.ruddnev.moves.DazzlingGleam;
import ru.ruddnev.moves.CottonSpore;
import ru.ruddnev.moves.Rest;

public class Cottonee extends Pokemon {
    public Cottonee(String name, int level) {
        super(name, level);

        if (level <= 0) {
            System.out.printf("WARNING! Not supported level! Omitting Pokemon %s\n", name);
            setMod(Stat.HP, 100000000);
        }

        setStats(40, 27, 60, 37, 50, 66);
        setType(Type.POISON, Type.FAIRY);

        setMove(new DazzlingGleam(), new CottonSpore(), new Rest());
    }
}
