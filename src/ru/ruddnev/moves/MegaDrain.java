package ru.ruddnev.moves;
import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {

    public MegaDrain() {
        super(Type.GRASS, 40, 100);
    }

    @Override
    protected String describe() {
        return "uses Mega Drain";
    }
}
