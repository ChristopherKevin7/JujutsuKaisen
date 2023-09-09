public class Allies extends Feiticeiros {
    private String name;

    public Allies(int level, int grade, int strength, int agility, int cursedEnergy, int specialization, String name) {
        super(level, grade, strength, agility, cursedEnergy, specialization);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
