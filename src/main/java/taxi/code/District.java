package taxi.code;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class District {

    private String name;
    private int population;
    private int wealth;
    private ArrayList<Depot> depots = new ArrayList<Depot>();

    public District(){

        this.name = this.generateName();
        this.population = (int)(Math.random() * 5000);
        this.wealth = 1 + (int)(Math.random() * 9);
        for (int i = 0;i < 5;i++){
            depots.add(new Depot(i));
        }

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

    public ArrayList<Depot> getDepots(){
        return this.depots;
    }

    public String printDrivers(){
        String out = " ";
        Iterator<Depot> it = this.depots.iterator();
        while (it.hasNext()){
            out = out + it.next().getDrivers();
        }
        return out;
    }

}
