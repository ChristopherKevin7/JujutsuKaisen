public class Feiticeiros {
  
    private int Life;//Vida do personagem
    private int Level;
    private int Grade;
    private int Strength;//Força fisica
    private int Agility;
    private int CursedEnergy;
    private int Specialization; //Estilo de batalha. Ex:Usuario de Maldições
   
    public Feiticeiros(int life,int level, int grade, int strength, int agility, int cursedEnergy, int specialization) {
        Life = life;
        Level = level;
        Grade = grade;
        Strength = strength;
        Agility = agility;
        CursedEnergy = cursedEnergy;
        Specialization = specialization;
    }
     
    public int getLife() {
        return Life;
    }

    public void setLife(int life) {
        Life = life;
    }
    public int getLevel() {
        return Level;
    }
    public void setLevel(int level) {
        Level = level;
    }
    public int getGrade() {
        return Grade;
    }
    public void setGrade(int grade) {
        Grade = grade;
    }
    public int getStrength() {
        return Strength;
    }
    public void setStrength(int strength) {
        Strength = strength;
    }
    public int getAgility() {
        return Agility;
    }
    public void setAgility(int agility) {
        Agility = agility;
    }
    public int getCursedEnergy() {
        return CursedEnergy;
    }
    public void setCursedEnergy(int cursedEnergy) {
        CursedEnergy = cursedEnergy;
    }
    public int getSpecialization() {
        return Specialization;
    }
    public void setSpecialization(int specialization) {
        Specialization = specialization;
    }

    
}
