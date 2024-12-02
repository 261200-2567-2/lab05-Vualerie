public class SpeedBoot implements Boot, Accessories{
    private int speed;
    private int agi_require;
    private String class_name = "Assassin";
    private Character owner;

    SpeedBoot(int speed,int agi_require) {
        this.speed = speed;
        this.agi_require = agi_require;
    }

    public void sprint() {
        System.out.println("sprinting");
    }

    public String getName() {
    return "SpeedBoot";
    }
    public int getStat(){
     return speed;
    }
    @Override
    public String getClassRequirement() {
    return class_name;
    }

    @Override
    public int getStatRequirement() {
    return agi_require;
    }
    public void equip(Character character) {
        this.owner = character;
    }

    @Override
    public void passiveAccess() {
        sprint();
    }
}
