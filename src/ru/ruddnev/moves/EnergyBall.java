package ru.ruddnev.moves;
import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {

    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon att) {
        if (Math.random() <= 0.1) {
            att.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "uses Energy Ball";
    }
}
