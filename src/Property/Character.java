package Property;

import Interface.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;
    public Character(){

    }
    public abstract void fight();
    public void setWeapon(WeaponBehavior w){
        this.weaponBehavior = w;
    }
}
