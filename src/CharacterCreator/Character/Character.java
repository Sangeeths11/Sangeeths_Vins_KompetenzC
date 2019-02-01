package CharacterCreator.Character;

import CharacterCreator.Weapon.Weapon;

public abstract class Character {

    private String name;
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void fight(){
        this.weapon.UseWeapon();
    }

}
