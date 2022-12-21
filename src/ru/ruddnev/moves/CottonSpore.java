package ru.ruddnev.moves;
import ru.ifmo.se.pokemon.*;

public class CottonSpore extends StatusMove {

    public CottonSpore() {
        super(Type.GRASS, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, -2);
    }

    @Override
    protected String describe() {
        return "uses Cotton Spore";
    }

}