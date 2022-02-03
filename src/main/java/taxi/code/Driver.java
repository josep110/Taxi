package taxi.code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.time.*;

public class Driver {

    private String name;
    private LocalTime start;
    private float shiftLength;

    public Driver(){

        this.name = this.generateName();
        this.start = LocalTime.now();
        this.shiftLength = (float)(Math.random() * 12);
    }

    private String generateName(){

        Scanner readin = null;
        File f_ = new File("src/main/resources/taxi/code/driver_names.txt");

        try{
            readin = new Scanner(f_);
        } catch(FileNotFoundException e){
            System.out.println("names file missing");
        }

        String[] prefix = readin.nextLine().split(";");
        String[] suffix = readin.nextLine().split(";");

        return prefix[(int)(Math.random() * prefix.length)] + " " + suffix[(int)(Math.random()*suffix.length)];
    }

    public String getName(){ return this.name; }

    public LocalTime getStart(){ return this.start; }

    public float getShiftLength(){ return this.shiftLength; }



}
