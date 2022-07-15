package taxi.code;

import java.util.ArrayList;
import java.util.Iterator;

public class City {

    //ArrayList<District> districts = new ArrayList<District>();
    District[] districts = new District[9];

    public City() {

        for (int i=0;i < 9;i++){
            districts[i] = new District("dis"+i+".fxml");
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
