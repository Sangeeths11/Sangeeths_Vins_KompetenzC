package CharacterCreator.Character;

import CharacterCreator.Weapon.Staff;

public class Magician extends Character {

    public Magician(String name) {
        this.setName(name);
        this.setWeapon(new Staff());
    }

    public void fight(){
        super.fight();
    }
}
