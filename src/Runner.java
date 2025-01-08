import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    @Test
    public void test() {
        Helmet h = new Helmet("Gold");
        assertEquals(1.5, h.getWeight(), .1);

        Gauntlets g = new Gauntlets();
        assertEquals(0,g.getEquipmentID());

        Gloves gl = new Gloves();
        assertEquals(1500, gl.getGloveCost());

        Boots b = new Boots();
        assertEquals(0, b.getRevisedStrength());

        BodyArmor ba = new BodyArmor();
        assertEquals(0, ba.getMaterialType());

        MeleeWeapon m = new MeleeWeapon();
        assertEquals(0, m.getDamage());

        Role r = new Role();
        assertEquals(0, r.getName());

        Shield s = new Shield();
        assertEquals(0, s.getMaterial());

        Species sp = new Species();
        assertEquals(0, sp.getCanFly());
    }
}
