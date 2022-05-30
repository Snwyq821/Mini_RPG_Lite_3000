package com.isep.rpg.hero;

public class Warrior extends Hero
{
    // Construct
    public Warrior()
    {
        this.setHp(100000);
        this.setArmor(1000);
        this.setWeaponDamage(5500);
    }

    public String getType() { return "Warrior"; }
}
