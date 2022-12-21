package ru.ruddnev.moves;
import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {

    public SludgeBomb() {
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3) {
            Effect.poison(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "uses Sludge Bomb";
    }
}
