public class defense extends Player{
    // Written by Logan Dabney, 09/12/18, EECS 2500
    // This extends the player class and adds more variables to a player object making a defensive player.
    protected int tackles;
    protected float sacks;
    protected int intecept;

    public defense (String position, String fullName, float weight, int age,
                    int tackles, float sacks, int intecept){
        super(position, fullName, weight, age);
        this.tackles = tackles;
        this.sacks = sacks;
        this.age = intecept;
    }
    public String toString() {
        String statistics;
        statistics = postion + "\n" + fullName + "\n" + weight + "\n" + age + "\n" +
                tackles + "\n" + sacks + "\n" + intecept + "\n";
        return statistics;
    }
}
