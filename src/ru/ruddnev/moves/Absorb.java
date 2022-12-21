package ru.ruddnev.moves;
import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {

    public Absorb() {
        super(Type.GRASS, 20, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, -10);
    }

    @Override
    protected String describe() {
        return "uses Dazzling Gleam";
    }
}
