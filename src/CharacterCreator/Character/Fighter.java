package CharacterCreator.Character;

import CharacterCreator.Character.Character;
import CharacterCreator.Weapon.Sword;

public class Fighter extends Character {

    public Fighter(String name) {
        this.setName(name);
        this.setWeapon(new Sword());
    }

    public void fight(){
        super.fight();
    }
}
