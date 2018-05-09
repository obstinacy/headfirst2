package Action;

import Interface.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("实现用斧头砍劈");
    }
}
