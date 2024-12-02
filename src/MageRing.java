public class MageRing implements Ring, Accessories{
    private int INT;
    private int INT_require;
    private String class_name = "Mage";
    private Character owner;
    private int base_int;

    MageRing(int INT,int INT_require) {
        this.INT = INT;
        this.INT_require = INT_require;
        this.base_int = INT;
    }

    public void INTup() {
        System.out.println("You are smarter than your old self");
    }


    public String getName() {
        return "MageRing";
    }
    public int getStat(){
        return INT;
    }
    @Override
    public String getClassRequirement() {
        return class_name;
    }

    @Override
    public int getStatRequirement() {
        return INT_require;
    }
    public void equip(Character character) {
        this.owner = character;
    }

    @Override
    public void passiveAccess() {
        INTup();
    }
}
