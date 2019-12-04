package com.design.pattern.strategy.character;

import com.design.pattern.strategy.weapon.WeaponBehavior;

public abstract class Character {

	private WeaponBehavior weaponBehavior;

	public void setWeaponBehavior(final WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}

	public void useWeapon() {
		weaponBehavior.useWeapon();
	}

	public abstract void fight();
}
