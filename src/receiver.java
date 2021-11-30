public class receiver extends Player{
    // Written by Logan Dabney, 09/12/18, EECS 2500
    // This extends the player class and adds more variables to a player object making a receiver.
    protected int receptions;
    protected int receptYards;
    protected int rushes;
    protected int fumbles;
    protected int rushYards;
    protected int TD;

    public receiver (String position, String fullName, float weight, int age,
                     int receptions, int receptYards, int rushes, int fumbles,
                     int rushYards, int TD){
        super(position, fullName, weight, age);
        this.receptions = receptions;
        this.receptYards = receptYards;
        this.rushes = rushes;
        this.fumbles = fumbles;
        this.rushYards = rushYards;
        this.TD = TD;
    }
public String toString() {
    String statistics;
    statistics = postion + "\n" + fullName + "\n" + weight + "\n" + age + "\n" +
            receptions + "\n" + receptYards + "\n" + rushes + "\n" + rushYards +
            "\n" + TD + "\n" + fumbles + "\n";
    return statistics;
}
}
