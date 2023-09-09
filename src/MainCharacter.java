public class MainCharacter extends Feiticeiros{
    private String Name;

    public MainCharacter(int level, int grade, int strength, int agility, int cursedEnergy, int specialization,
            String name) {
        super(level, grade, strength, agility, cursedEnergy, specialization);
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    
    
}
