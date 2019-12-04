package com.design.pattern.strategy.weapon;

public class DefaultBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		try {
			throw new Exception("no weapon!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
