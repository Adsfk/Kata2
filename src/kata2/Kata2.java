package kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {
   
    public static void main(String[] args) {
        String[] array = {"Pepe","Juan","Pedro","Pepe","Antonio","Juan","Antonio","Antonio","Pedro","Jose"};
        Histogram<String> histo = new Histogram(array);
        Map<String,Integer> histogr = histo.getHistogram();
        Iterator<Map.Entry<String, Integer>> it = histogr.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String,Integer> entry = it.next();
            System.out.println(entry.getKey()+" ==> "+ entry.getValue());
        }
    }
    
}
