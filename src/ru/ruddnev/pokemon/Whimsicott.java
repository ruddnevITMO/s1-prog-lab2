package ru.ruddnev.pokemon;
import ru.ifmo.se.pokemon.*;

import ru.ruddnev.moves.Moonblast;

public class Whimsicott extends Cottonee {
    public Whimsicott(String name, int level) {
        super(name, level);

        if (level <= 0) {
            System.out.printf("WARNING! Not supported level! Omitting Pokemon %s\n", name);
            setMod(Stat.HP, 100000000);
        }

        setStats(60, 67, 85, 77, 75, 116);
        setType(Type.POISON, Type.FAIRY);

        addMove(new Moonblast());
    }
}
