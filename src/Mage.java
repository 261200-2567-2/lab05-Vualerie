public class Mage extends BaseCharacter implements Character {
    Accessories accessory;

    Mage(String name){
        super(name);
        super.class_name = "Mage";
        super.INT *= 2;
        updateStatus();
    }

    @Override
    public void CanEquip(Accessories acc) {
        if(acc.getName().equals("SpeedBoot"))
        {
        if(this.class_name.equals(acc.getClassRequirement()) && super.AGI > acc.getStatRequirement()){
            System.out.println("can equip this accessory");
        }
        else if(acc.getClassRequirement().equals(class_name)){
            System.out.println("Your stat is lower than required");
        }
        else{
            System.out.println("Your class isn't required this accessory");
        }
        }
        else if(acc.getName().equals("MageRing")){
            if(this.class_name.equals(acc.getClassRequirement()) && super.INT > acc.getStatRequirement()){
                System.out.println("can equip this accessory");
            }
            else if(acc.getClassRequirement().equals(class_name)){
                System.out.println("Your stat is lower than required");
            }
            else{
                System.out.println("Your class isn't required this accessory");
            }
        }
        else {
            System.out.println("Invalid accessory");
        }
    }
    public void equip(Accessories acc){
        if(acc.getName().equals("SpeedBoot"))
        {
            if(this.class_name.equals(acc.getClassRequirement()) && super.AGI > acc.getStatRequirement()){
                this.accessory = acc;
                acc.equip(this);
                super.spd += acc.getStat();
                System.out.println(super.name + " has equipped " + acc.getName());
                updateStatus();
            }
            else{
                CanEquip(acc);
            }
        }
        else if(acc.getName().equals("MageRing")){
            if(this.class_name.equals(acc.getClassRequirement()) && super.INT > acc.getStatRequirement()){
                this.accessory = acc;
                acc.equip(this);
                super.INT += acc.getStat();
                System.out.println(super.name + " has equipped " + acc.getName());
                updateStatus();
            }
            else{
                CanEquip(acc);
            }
        }
        else{
            System.out.println("Invalid accessory");
        }

    }

    public Accessories getAccessory(){
        return this.accessory;
    }
}

