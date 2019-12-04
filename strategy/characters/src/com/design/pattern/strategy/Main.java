package com.design.pattern.strategy;

import com.design.pattern.strategy.character.Character;
import com.design.pattern.strategy.character.King;
import com.design.pattern.strategy.character.Princess;
import com.design.pattern.strategy.weapon.DefaultBehavior;
import com.design.pattern.strategy.weapon.SwordBehavior;

public class Main {

	public static void main(String[] args) {
		Character character = new King();
		character.setWeaponBehavior(new SwordBehavior());
		character.fight();
		character.useWeapon();

		character = new Princess();
		character.setWeaponBehavior(new DefaultBehavior());
		character.fight();
		character.useWeapon();
	}
}
