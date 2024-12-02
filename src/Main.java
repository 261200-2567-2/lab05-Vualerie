// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Assassin a = new Assassin("A");
        Warrior w = new Warrior("W");
        Mage m = new Mage("M");
        SpeedBoot s = new SpeedBoot(5,15);
        MageRing r = new MageRing(5,6);
        a.CanEquip(s);
        a.equip(s);
        a.levelUp();
        a.CanEquip(s);
        a.levelUp();
        a.levelUp();
        a.levelUp();
        a.levelUp();
        a.levelUp();
        a.showStatus();
        a.CanEquip(s);
        a.equip(s);
        a.getAccessory().passiveAccess();
        a.showStatus();
        w.CanEquip(s);
        w.equip(s);
        m.showStatus();
        m.CanEquip(r);
        m.equip(r);
        m.showStatus();
        m.getAccessory().passiveAccess();
        m.showStatus();
        m.equip(s);
    }
}