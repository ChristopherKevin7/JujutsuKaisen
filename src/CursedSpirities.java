public class CursedSpirities {
    private int Grade;
    private int level;
    private int CursedEnergy;
    private int Life;
    private int Strength;
    
    public CursedSpirities(int grade, int level, int cursedEnergy, int life, int strength) {
        Grade = grade;
        this.level = level;
        CursedEnergy = cursedEnergy;
        Life = life;
        Strength = strength;
    }
    
    public int getGrade() {
        return Grade;
    }
    public void setGrade(int grade) {
        Grade = grade;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getCursedEnergy() {
        return CursedEnergy;
    }
    public void setCursedEnergy(int cursedEnergy) {
        CursedEnergy = cursedEnergy;
    }
    public int getLife() {
        return Life;
    }
    public void setLife(int life) {
        Life = life;
    }
    public int getStrength() {
        return Strength;
    }
    public void setStrength(int strength) {
        Strength = strength;
    }
    
}
