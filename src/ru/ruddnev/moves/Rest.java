package ru.ruddnev.moves;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect().condition(Status.SLEEP).turns(2);
//        int full = (int)Math.ceil(pokemon.getStat(Stat.HP) - pokemon.getHP());
//        pokemon.setMod(Stat.HP, -full);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "uses Rest";
    }
}