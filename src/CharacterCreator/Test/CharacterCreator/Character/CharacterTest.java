package CharacterCreator.Character;

import CharacterCreator.Weapon.Bow;
import CharacterCreator.Weapon.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    Archer archer = new Archer("Test");

    @Test
    void setWeapon() {
        Bow bow = new Bow();
        archer.setWeapon(bow);
        assertEquals(bow, archer.getWeapon());
    }

    @Test
    void getName() {
        assertEquals("Test", archer.getName());
    }

    @Test
    void setName() {
        String name = "New Name";
        archer.setName(name);
        assertEquals(name, archer.getName());
    }

    @Test
    void fight() {
        Bow bow = new Bow();
        archer.setWeapon(bow);
        archer.fight();
        assertEquals(Weapon.MEDIUMCONDTIION, archer.getWeapon().getCondition());
    }
}