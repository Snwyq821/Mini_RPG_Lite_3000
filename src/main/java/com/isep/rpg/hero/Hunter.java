package com.isep.rpg.hero;

import com.isep.rpg.enemy.Enemy;

public class Hunter extends Hero
{
    int arrows;

    public int getArrows() { return arrows; }

    @Override
    public void attack(Enemy enemy)
    {
        super.attack(enemy);
        this.arrows -=1;
    }

    // Constructeur
    public Hunter()
    {
        this.setHp(70000);
        this.arrows = 20;
        this.setArmor(1000);
        this.setWeaponDamage(8000);
    }

    public String getType() { return "Hunter"; }
}
