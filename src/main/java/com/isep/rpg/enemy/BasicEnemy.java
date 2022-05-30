package com.isep.rpg.enemy;

public class BasicEnemy extends Enemy
{
    // Construct
    public BasicEnemy()
    {
        this.setHp(30000);
        this.setWeaponDamage(10000);
    }

    public String getType() { return "BasicEnemy"; }
}
