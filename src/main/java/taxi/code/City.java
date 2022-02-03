package taxi.code;

import java.util.ArrayList;
import java.util.Iterator;

public class City {

    ArrayList<District> districts = new ArrayList<District>();

    public City() {
        for (int i=0;i <= 1+(int)(Math.random()*12);i++){
            districts.add(new District());
        }
    }

    public void printDistricts() {

        Iterator<District> iter_Distr = districts.iterator();
        while (iter_Distr.hasNext()) {
            District d = iter_Distr.next();
            System.out.println(d.getName());
            System.out.println(d.getPop());
            System.out.println(d.getWealth());
        }
    }

    public String allDrivers(){
        String out = "";
        Iterator<District> iter_Distr = districts.iterator();
        while (iter_Distr.hasNext()) {
            System.out.println(iter_Distr.next().printDrivers());
        }
        return out;
    }

}
