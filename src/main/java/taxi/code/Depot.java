package taxi.code;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Depot {

    private int number;
    private ArrayList<Driver> drivers = new ArrayList<Driver>();

    public Depot(int total){
        this.number = total + 1;
        for (int i = 0;i < 10;i++){
            this.drivers.add(new Driver());
        }
    }

    public int getNo(){ return this.number; }

    public String getDrivers(){
        String out = " ";
        Driver current;
        Iterator<Driver> it = drivers.iterator();
        while (it.hasNext()){
            current = it.next();
            out = out + "\n" + current.getName() + " " + current.getStart() + " " + current.getShiftLength();
        }
        return out;
    }
}
