public class BaseCharacter {
    protected Stat stat;
    protected String name;
    protected int STR;
    protected int INT;
    protected int AGI;
    protected int VIT;
    protected int atk;
    protected int def;
    protected int spd;
    protected int m_atk;
    protected int hp;
    protected int mp;
    protected int level;
    protected String class_name;

    BaseCharacter(String name){
        this.name = name;
        this.stat = new Stat( 5, 5, 5,5);
        this.level = 1;
        calculateStatus();
    }

    protected void calculateStatus(){
        hp = this.stat.getVit()*20 - this.level*10 + 10;
        mp = this.stat.getVit()*10 - this.level*8 + 8 +this.INT*2;
        atk = this.stat.getStr();
        m_atk = this.stat.getInt();
        def = this.stat.getVit();
        spd = this.stat.getAgi();
        STR = this.stat.getStr();
        INT = this.stat.getInt();
        AGI = this.stat.getAgi();
        VIT = this.stat.getVit();
    }
    protected void levelUp(){
        this.level++;
        System.out.println(this.name + " level up!!!");
        this.stat = new Stat(this.STR + 1,
                this.VIT + 1,
                this.AGI + 1,
                this.INT + 1);
        calculateStatus();
    }

    protected void showStatus(){
        System.out.println("Character Status");
        System.out.println("Name: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("HP: " + this.hp);
        System.out.println("MP: " + this.mp);
        System.out.println("STR: " + this.stat.getStr() + ", VIT: " + this.stat.getVit()
                + ", AGI: " + this.stat.getAgi() + ", INT: " + this.stat.getInt());
        System.out.println("ATK: " + this.atk + ", DEF: " + this.def
                + ", SPD: " + this.spd);
    }

    public void updateStatus(){
        this.stat = new Stat( this.STR, this.VIT, this.AGI,this.INT);
        calculateStatus();
    }


}
