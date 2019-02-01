package CharacterCreator.Weapon;

public class Weapon implements IWeapon {

    public static final int GOODCONDTIION = 2;
    public static final int MEDIUMCONDTIION = 1;
    public static final int BADCONDTIION = 0;

    private int Condition = 2;

    public void UseWeapon() {
        if (Condition != BADCONDTIION) {
            Condition--;
        }
    }

    public void RepairWeapon() {
        Condition++;
    }

    public boolean isBroken() {
        return (Condition == 0);
    }

    public int getCondition() {
        return Condition;
    }
}
