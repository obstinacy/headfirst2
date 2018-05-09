package Action;

import Interface.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("实现用宝剑挥舞");
    }
}
