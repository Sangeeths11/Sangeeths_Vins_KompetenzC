package CharacterCreator.Character;

import CharacterCreator.Weapon.Bow;

public class Archer extends Character {

    public Archer(String name) {
        this.setName(name);
        this.setWeapon(new Bow());
    }

    public void fight(){
        super.fight();
    }
}
