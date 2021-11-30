public class quarterBack extends Player {
    // Written by Logan Dabney, 09/12/18, EECS 2500
    // This extends the player class and adds more variables to a player object making a quarterback.
    protected int passAttem;
    protected int passComp;
    protected int passYards;
    protected int rushAttem;
    protected int rushYards;
    protected int TD;
    protected int intercept;
    protected int fumbles;
    protected int sacks;

    public quarterBack(String position, String fullName, float weight, int age, int passAttem, int passComp,
                       int passYards, int rushAttem, int rushYards, int TD, int intercept, int fumbles, int sacks){
        super(position, fullName, weight, age);
        this.passAttem = passAttem;
        this.passComp = passComp;
        this.passYards = passYards;
        this.rushAttem = rushAttem;
        this.rushYards = rushYards;
        this.TD = TD;
        this.intercept = intercept;
        this.fumbles = fumbles;
        this.sacks = sacks;
    }
    public quarterBack(){
        super("N/A", "N/A", 0, 0);
        this.passAttem = 0;
        this.passComp = 0;
        this.passYards = 0;
        this.rushAttem = 0;
        this.rushYards = 0;
        this.TD = 0;
        this.intercept = 0;
        this.fumbles = 0;
        this.sacks = 0;
}
    public String toString() {
        String statistics;
        statistics = postion + "\n" + fullName + "\n" + weight + "\n" + age + "\n" +
                passAttem + "\n" + passComp + "\n" + passYards + "\n" + rushAttem + "\n" +
                rushYards + "\n" + TD + "\n" + intercept + "\n" + fumbles + "\n" + sacks + "\n";
        return statistics;
    }
}
