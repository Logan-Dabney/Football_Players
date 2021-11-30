
public class Player {
    // Written by Logan Dabney, 09/12/18, EECS 2500
    // This code creates a player object with position, full name, weight, and age.
    protected String postion;
    protected String fullName;
    protected float weight;
    protected int age;
    public Player(String p, String n, float w, int a){
        this.postion = p;
        this.fullName = n;
        this.weight = w;
        this.age = a;
    }
    Player(){
        this.postion = "";
        this.fullName = "";
        this.weight = 0;
        this.age = 0;
    }

public String getPostion() {
    return postion;
}

public void setPostion(String postion) {
    this.postion = postion;
}

public String getFullName() {
    return fullName;
}

public void setFullName(String fullName) {
    this.fullName = fullName;
}

public float getWeight() {
    return weight;
}

public void setWeight(float weight) {
    this.weight = weight;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}
}
