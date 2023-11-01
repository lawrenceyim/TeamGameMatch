package com.solvd.teamgamematch.game.Abilities;

public class SonicWaveResonatingStrike extends Ability {

    public SonicWaveResonatingStrike() {
        super("Sonic Wave/Resonating Strike", 10,
                "Sonic Wave: Lee Sin projects a discordant wave of sound to locate his enemies, dealing " +
                        "physical damage to the first enemy it encounters. If Sonic Wave hits, Lee Sin can cast " +
                        "Resonating Strike for the next 3 seconds. Resonating Strike: Lee Sin dashes to the enemy " +
                        "hit by Sonic Wave, dealing physical damage based on the target's missing Health."
                );
    }

    @Override
    public void castAbility() {
        System.out.println(getAbilityName() + " used " + getAbilityName());
    }
}