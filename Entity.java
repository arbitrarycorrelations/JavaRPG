import java.util.HashMap;
import java.util.Map;

public class Entity {
    private int max_health;
    private int current_health; 
    private int max_mp;
    private int current_mp;
    private int base_attack;
    private int total_attack;
    private int speed;
    private int defense; 
    private int resistance; 
    private Weapon equipped_weapon;
}

class Hero extends Entity {
    private Esper equipped_esper;
    private Map<Integer, Spell> spell_points = new HashMap<Integer, Spell>();

}

class Enemy extends Entity{}

class Boss extends Entity {}