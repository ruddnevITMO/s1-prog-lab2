package ru.ruddnev.moves;
import ru.ifmo.se.pokemon.*;

public class RockPolish extends StatusMove {

    public RockPolish() {
        super(Type.ROCK, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, 2);
    }

    @Override
    protected String describe() {
        return "uses Rock Polish";
    }

//    protected void applySelfEffects(Pokemon pokemon) {
//
//    }
}
