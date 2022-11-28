import java.util.HashMap;
import java.util.Map;

public class Entity {
    protected int max_health;
    protected int current_health; 
    protected int max_mp;
    protected int current_mp;
    protected int base_attack;
    protected int total_attack;
    protected int speed;
    protected int defense; 
    protected int resistance; 
    protected Weapon equipped_weapon;
    protected Map<Integer, Spell> spells = new HashMap<Integer, Spell>();
}

class Hero extends Entity {

    Hero(){
        this.max_health = 100;
    }
    private Esper equipped_esper;
    private Map<Integer, Spell> spell_points = new HashMap<Integer, Spell>();

}

class Enemy extends Entity{}

class Boss extends Entity {}