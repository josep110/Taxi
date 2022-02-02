package taxi.code;
import java.io.*;
import java.util.Scanner;

public class District {

    private String name;
    private int population;
    private int wealth;

    public District(){

        this.name = this.generateName();
        this.population = (int)(Math.random() * 5000);
        this.wealth = 1 + (int)(Math.random() * 9);
    }

    private String generateName(){

        Scanner readin = null;
        File f_ = new File("src/main/resources/taxi/code/names.txt");
        
        try{
            readin = new Scanner(f_);
        } catch(FileNotFoundException e){
            System.out.println("names file missing");
        }

        String[] prefix = readin.nextLine().split(";");
        String[] suffix = readin.nextLine().split(";");

        return prefix[(int)(Math.random() * prefix.length)] + " " + suffix[(int)(Math.random()*suffix.length)];
    }
    
    public String getName(){
        return this.name;
    }

    public int getPop(){
        return this.population;
    }

    public int getWealth(){
        return this.wealth;
    }
}
