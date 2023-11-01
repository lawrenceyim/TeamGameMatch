package com.solvd.teamgamematch.game.Abilities;

public class Switcheroo extends Ability {

    public Switcheroo() {
        super("Switcheroo", 0.9,
                "Jinx modifies her basic attacks by swapping between Pow-Pow, her minigun and Fishbones, " +
                        "her rocket launcher. Attacks with Pow-Pow grant Attack Speed, while attacks with Fishbones " +
                        "deal area of effect damage, gain increased range, but drain Mana and attack slower.");
    }

    @Override
    public void castAbility() {
        System.out.println(getAbilityName() + " used " + getAbilityName());
    }
}