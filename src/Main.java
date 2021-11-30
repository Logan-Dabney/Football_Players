import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    // Written by Logan Dabney, 09/12/18, EECS 2500
    // This code reads in from a file and stores the information into objects
    // which are stored into an ArrayList.
    public static void main(String[] args){
        ArrayList team = new ArrayList();
        String postion;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("playerinfo.txt"));
            while ((postion = reader.readLine()) != null){
                if(postion.equals("Quarterback")){
                    team.add(new quarterBack(postion,
                            reader.readLine(), Float.valueOf(reader.readLine()),
                            Integer.valueOf(reader.readLine()), Integer.valueOf(reader.readLine()),
                            Integer.valueOf(reader.readLine()), Integer.valueOf(reader.readLine()),
                            Integer.valueOf(reader.readLine()), Integer.valueOf(reader.readLine()),
                            Integer.valueOf(reader.readLine()), Integer.valueOf(reader.readLine()),
                            Integer.valueOf(reader.readLine()), Integer.valueOf(reader.readLine())));
                } else if(postion.equals("Defense")){
                    team.add(new defense(postion,
                            reader.readLine(), Float.valueOf(reader.readLine()),
                            Integer.valueOf(reader.readLine()), Integer.valueOf(reader.readLine()),
                            Float.valueOf(reader.readLine()), Integer.valueOf(reader.readLine())));
                } else {
                    team.add(new receiver(postion,
                            reader.readLine(), Float.valueOf(reader.readLine()),
                            Integer.valueOf(reader.readLine()), Integer.valueOf(reader.readLine()),
                            Integer.valueOf(reader.readLine()), Integer.valueOf(reader.readLine()),
                            Integer.valueOf(reader.readLine()), Integer.valueOf(reader.readLine()),
                            Integer.valueOf(reader.readLine())));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        for (int i = 0; i < team.size(); i++){
            System.out.print(team.get(i).toString());
        }
    }
}